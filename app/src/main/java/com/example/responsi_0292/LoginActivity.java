package com.example.responsi_0292;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button mBtnLogin;
    EditText pass;
    EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.et_uname);
        pass = findViewById(R.id.et_pass);
        mBtnLogin = findViewById(R.id.btn_login);

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey = username.getText().toString();
                String passwordKey = pass.getText().toString();

                if (usernameKey.equals("admin") && passwordKey.equals("admin123")){
                    //jika berhasil
                    Toast.makeText(getApplicationContext(), "Ayeayyy Login Berhasil",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
                    LoginActivity.this.startActivity(intent);
                    finish();
                }
                else {
                    //jika gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                    builder.setMessage("Username atau Password anda SALAH !")
                            .setNegativeButton("Retry",null).create().show();
                }
            }
        });
    }
}
