package com.example.myfirstapplication;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteCursor;
public class DBWriter {
    public DBWriter(){

    }
    public void  using_DB(Context c ,String userId,String messageText){
        DBHelper dbHelper = new DBHelper(c);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();//很像一个map
        values.put("user_id", userId);
        values.put("text", messageText);
        long messageId = db.insert("table name", null, values);//讲键值对放到input的表名中
        //如果成功返回1如果失败返回-1
        //从table中找东西其中null之间是condition的语句
        Cursor cursor = db.query("table name", new String[] { "id", "user_id", "text" },
                null, null, null, null, "id DESC");
        while(cursor.moveToNext()) {
             //从Cursor中获取数据遍历整个数据库
        }
        cursor.close();
        db.close();
        //关闭拿到的数据，关闭数据库
    }




}
