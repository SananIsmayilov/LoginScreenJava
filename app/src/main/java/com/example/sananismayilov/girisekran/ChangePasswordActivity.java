package com.example.sananismayilov.girisekran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChangePasswordActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences ;
    EditText editText;
    Button button;
    String password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        editText = findViewById(R.id.editTextTextPassword);
        button = findViewById(R.id.button);
        sharedPreferences = getSharedPreferences("com.example.sananismayilov.girisekran",MODE_PRIVATE);
        SharedPreferences.Editor  editor = sharedPreferences.edit();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString().length()==4){
                    editor.putString("password",editText.getText().toString());
                    editor.commit();
                    Toast.makeText(ChangePasswordActivity.this, "Giriş şifrəniz uğurla dəyişdirildi...", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ChangePasswordActivity.this, "Parolunuzun uzunluğu 4 simvoldan çox ola bilməz", Toast.LENGTH_SHORT).show();
                }

            }
        });





    }
}