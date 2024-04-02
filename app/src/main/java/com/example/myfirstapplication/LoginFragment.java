package com.example.myfirstapplication;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.navigation.fragment.NavHostFragment;
import com.android.application.R;

public class LoginFragment extends Fragment {

    public LoginFragment() {
        // 空参构造
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // 把xml文件充气成一个实际的view对象
        return inflater.inflate(R.layout.login, container, false);
        //里面的.layout.后面跟的xml配置文件名
    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // 找到登录按钮并设置点击事件监听器
        View buttonLogin = view.findViewById(R.id.confirmButton);

        buttonLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                /*EditText usernameEditText = view.findViewById(R.id.usernameEditText);
                EditText passwordEditText = view.findViewById(R.id.passwordEditText);
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();*/
                //会出现问题只要实现了检查的目的就会闪退
                NavHostFragment.findNavController(LoginFragment.this)
                        .navigate(R.id.action_login_to_homepage);
                //if (validateLogin(username, password)) {
                    // 如果账号和密码验证成功，导航到HomePageFragment
                   /* NavHostFragment.findNavController(LoginFragment.this)
                            .navigate(R.id.action_login_to_homepage);*/
                //}
                /*else {
                    // 如果验证失败，显示错误消息
                    Toast.makeText(getContext(), "wrong！", Toast.LENGTH_SHORT).show();
                }*/
            }
        });
    }
    private boolean validateLogin(String username, String password) {
        return "123".equals(username) && "1234".equals(password); //还需要调数据库找信息
    }


}
