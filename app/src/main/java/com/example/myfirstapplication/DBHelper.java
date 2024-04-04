package com.example.myfirstapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;
import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "SafeHive.db";

    private Context mContext;
    private static final String User_table = "create table Student ("
            +"id integer primary key autoincrement,"
            +"user text"
            +"password text)";



    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mContext = context;
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(User_table);
        Toast.makeText(mContext,"succeded",Toast.LENGTH_SHORT);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}