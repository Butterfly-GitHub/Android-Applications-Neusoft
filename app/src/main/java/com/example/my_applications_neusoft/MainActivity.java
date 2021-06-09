package com.example.my_applications_neusoft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    private Button button_login;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_login = findViewById(R.id.button_login);

        SharedPreferences preferences = getSharedPreferences("user", MODE_PRIVATE);
        final String name = preferences.getString("name", "");
        final String pwd = preferences.getString("pwd", "");

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //是否记住密码
//                if (checkBox.isChecked()) {
//
//                }
                //检测（纯数字）账户名和密码

                if (verfication_passed(name, pwd)) {
                    goTo_LoginOK();
                }else {
                    goTo_LoginException();
                }
                
            }

            /**
             * 验证（纯数字）账户名和密码是否通过
             * @return
             */
            private boolean verfication_passed(String name, String pwd) {

                return "123".equals(name) && "1234".equals(pwd);
            }

            /**
             * 从当前页面跳转到LoginException页面
             */
            private void goTo_LoginException() {
                Intent intent = new Intent(MainActivity.this, LoginException.class);
                startActivity(intent);
            }
            /**
             * 从当前页面跳转到LoginOK页面
             */
            private void goTo_LoginOK() {
                Intent intent = new Intent(MainActivity.this, LoginOK.class);
                startActivity(intent);
            }
        });


    }


}