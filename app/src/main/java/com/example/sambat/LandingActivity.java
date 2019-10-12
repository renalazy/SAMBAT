package com.example.sambat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LandingActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLogin:
                Intent moveToLogin = new Intent(LandingActivity.this, LoginActivity.class);
                startActivity(moveToLogin);
            case R.id.btnRegister:
                Intent moveToRegister = new Intent(LandingActivity.this, RegisterActivity.class);
                startActivity(moveToRegister);
        }
    }
}
