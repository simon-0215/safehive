/*
package com.example.myfirstapplication;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegisterFragment extends Fragment {

    private FirebaseAuth mAuth; // 声明一个FirebaseAuth实例

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.register, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mAuth = FirebaseAuth.getInstance(); // 初始化FirebaseAuth实例

        EditText editTextEmail = view.findViewById(R.id.registerUsernameEditText);
        EditText editTextPassword = view.findViewById(R.id.registerPasswordEditText);
        Button buttonRegister = view.findViewById(R.id.registerButton);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editTextEmail.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                // 确保邮箱和密码不为空
                if (!TextUtils.isEmpty(email) && !TextUtils.isEmpty(password)) {
                    // 使用FirebaseAuth创建用户
                    mAuth.createUserWithEmailAndPassword(email, password)
                            .addOnCompleteListener(getActivity(), task -> {
                                if (task.isSuccessful()) {
                                    // 注册成功
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    Toast.makeText(getActivity(), "注册成功", Toast.LENGTH_SHORT).show();

                                    // 可选：更新UI或跳转到其他Fragment或Activity
                                } else {
                                    // 注册失败
                                    Toast.makeText(getActivity(), "注册失败：" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            });
                } else {
                    Toast.makeText(getActivity(), "邮箱和密码不能为空", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

*/
