package com.example.myfirstapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.android.application.R;



public class HomePageFragment extends Fragment {


        public HomePageFragment() {
            // 空参构造
        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // 把xml文件充气成一个实际的view对象
        return inflater.inflate(R.layout.homepage, container, false);
        //里面的.layout.后面跟的xml配置文件名
    }

    @Override
    public void onViewCreated(@NonNull View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        EditText editTextUserInput = view.findViewById(R.id.usernameEditText);
        Button buttonSubmit = view.findViewById(R.id.buttonSubmit);
        TextView textViewDisplay = view.findViewById(R.id.content);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 获取EditText中的文本
                String userInput = editTextUserInput.getText().toString();

                // 将文本设置到TextView中，以显示给用户
                textViewDisplay.setText(userInput);
            }
        });
    }



    }
