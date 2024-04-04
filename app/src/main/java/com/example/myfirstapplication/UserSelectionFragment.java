package com.example.myfirstapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.android.application.R;

public class UserSelectionFragment extends Fragment {
    public UserSelectionFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // 把xml文件充气成一个实际的view对象
        return inflater.inflate(R.layout.user_selection, container, false);
        //里面的.layout.后面跟的xml配置文件名
    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // 找到登录按钮并设置点击事件监听器
        View user1Chatbotton = view.findViewById(R.id.user1ChatButton);

        user1Chatbotton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                /*EditText usernameEditText = view.findViewById(R.id.usernameEditText);
                EditText passwordEditText = view.findViewById(R.id.passwordEditText);
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();*/
                //会出现问题只要实现了检查的目的就会闪退
                NavHostFragment.findNavController(UserSelectionFragment.this)
                        .navigate(R.id.action_UserSelectionFragment_to_HomePageFragment);
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
}
