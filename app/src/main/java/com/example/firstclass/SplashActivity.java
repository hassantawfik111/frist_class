package com.example.firstclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SplashActivity extends AppCompatActivity {

    Button login;
    EditText UserNameLabel;
    EditText Passwordlabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Log.e("lifeCycle","onCreate");
        login = findViewById(R.id.login_btn);
        UserNameLabel = findViewById(R.id.UserName);
        Passwordlabel = findViewById(R.id.Password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userNameText= UserNameLabel.getText().toString();
                String passwordText= Passwordlabel.getText().toString();
                if("android".equals(userNameText)&&"android".equals(passwordText)){
                    //goto welcomeScreen
                    openWelcomeActivity();
                }else {
                    Toast.makeText(SplashActivity.this, R.string.invalid_UserName_Password,
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("lifeCycle","onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("lifeCycle","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("lifeCycle","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("lifeCycle","onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("lifeCycle","onDestroy");
    }

    public void openWelcomeActivity(){
        Intent intent =new Intent(SplashActivity.this,WelcomeActivity.class);
        startActivity(intent);
        finish();
    }


}
