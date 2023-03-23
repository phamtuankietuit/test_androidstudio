package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText_username = (EditText) findViewById(R.id.editText_username);
        EditText editText_password = (EditText) findViewById(R.id.editText_password);
        Button btn_login = (Button) findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String a = editText_username.getText().toString();
                String b = editText_password.getText().toString();

                if (a.equals("admin") && (b.equals("admin")))
                {
                    Toast.makeText(MainActivity.this, "Thành công", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Thất bại", Toast.LENGTH_SHORT).show();


            }
        });


    }






}