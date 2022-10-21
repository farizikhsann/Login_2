package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.login.helper.Helper;

public class Login2 extends AppCompatActivity {
    EditText txtUsername, txtPassword;
    Button btn;
    TextView tvDaftar;
    String username = "1";
    String password = "a";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        btn = findViewById(R.id.btn);
        tvDaftar = findViewById(R.id.tvDaftar);

        btn.setOnClickListener(view -> {
            String user = txtUsername.getText().toString();
            String pass = txtPassword.getText().toString();

            if((user.equals(username) && (pass.equals(password))))
            {
                Toast.makeText(this, "Sukses Login", Toast.LENGTH_SHORT).show();
                Helper.setUsername(user);
                startActivity(new Intent(this, Dashboard.class));
            }else{
                Toast.makeText(this,"Login Gagal", Toast.LENGTH_SHORT).show();
            }

        });
    }
}

