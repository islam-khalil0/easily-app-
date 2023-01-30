package com.example.appeasily;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText ed_userName ;
    EditText ed_password ;
    Button btn_login ;
    TextView tv_newAccount ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        ed_userName = (EditText) findViewById(R.id.userName);
        ed_password = (EditText) findViewById(R.id.password);
        btn_login = (Button) findViewById(R.id.login_button);
        tv_newAccount = (TextView) findViewById(R.id.new_account_tv);




        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = ed_userName.getText().toString();
                String password = ed_password.getText().toString();

                if(user.equals("") && password.equals("")){
                    ed_userName.setError("user name is empty");
                    ed_password.setError("password is empty");
                }else{
                    if (user.equals("")){
                        ed_userName.setError("user name is empty");
                    }else {
                        if (password.equals("")){
                            ed_password.setError("password is empty");
                        }else {
                            Intent intent = new Intent(MainActivity2.this , MainActivity3.class);
                            startActivity(intent);
                            finish();
                        }
                    }
                }
            }
        });


        tv_newAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this ,MainActivity4_createNewAccount.class);
                startActivity(intent);
            }
        });

    }
    }