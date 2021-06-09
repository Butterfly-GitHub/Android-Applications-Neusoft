package com.example.my_applications_neusoft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.my_applications_neusoft.service.MyService;

/**
 * 登录成功
 * 并在3s之后自动跳转到Notepad页面
 */
public class LoginOK extends AppCompatActivity {
    private Intent intent;
    private TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_o_k);

        textView4 = findViewById(R.id.textView4);

        intent = new Intent(LoginOK.this, MyService.class);

        startService(intent);
        //3s之后自动跳转页面到Notepad！
        stopService(intent);

        textView4.setText("倒计时开始了哦：");

        new Thread(new Runnable() {
            @Override
            public void run() {
                int time = 3;
                while (time != 0) {
                    try {
                        Thread.sleep( 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    textView4.setText("页面将在\n" +time+ "s\n后自动跳转");
                    time--;
                }

                Intent intent_goTo_Notepad = new Intent(LoginOK.this, Notepad.class);
                startActivity(intent_goTo_Notepad);
            }
        }).start();
        //启动服务。=》并在服务中，开辟一个子线程，用于计时3s
//        MyService myService = new MyService();
    }
}