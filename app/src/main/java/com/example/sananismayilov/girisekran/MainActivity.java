package com.example.sananismayilov.girisekran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int say = 0;
String  kod1,kod="";
Button btn1,btn2,btn3,btn4;
SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.bos1);
        btn2 = findViewById(R.id.bos2);
        btn3 = findViewById(R.id.bos3);
        btn4 = findViewById(R.id.bos4);

        sharedPreferences = getSharedPreferences("com.example.sananismayilov.girisekran",MODE_PRIVATE);
        SharedPreferences.Editor  editor = sharedPreferences.edit();

        kod1 = sharedPreferences.getString("password","");

        if(kod1.equals("")){
            Intent intent = new Intent(this, ChangePasswordActivity.class);
            startActivity(intent);
        }

    }
    @SuppressLint("NonConstantResourceId")
    public void btnclick(View v){
        say++;
     if(v.getId()==R.id.btn1){
        kod += '1';
     } else if (v.getId() == R.id.btn2) {
         kod += '2';
     }else if (v.getId() == R.id.btn3) {
         kod += '3';
     }else if (v.getId() == R.id.btn4) {
         kod += '4';
     }else if (v.getId() == R.id.btn5) {
         kod += '5';
     } else if (v.getId() == R.id.btn6) {
         kod += '6';
     }else if (v.getId() == R.id.btn7) {
         kod += '7';
     }else if (v.getId() == R.id.btn8) {
         kod += '8';
     } else if (v.getId() == R.id.btn9) {
         kod += '9';
     }else if (v.getId() == R.id.btn0) {
         kod += '0';
     }



        if(say==1){
         btn1.setBackgroundResource(R.drawable.dolu);
     } else if (say==2){
         btn2.setBackgroundResource(R.drawable.dolu);
     } else if (say==3){
         btn3.setBackgroundResource(R.drawable.dolu);
     } else if (say==4){
         btn4.setBackgroundResource(R.drawable.dolu);
         if(kod1.equals(kod)){
             Intent intent = new Intent(this, ChangePasswordActivity.class);
             startActivity(intent);
         } else {
             Toast.makeText(this, "Giriş şifrəniz doğru deyil", Toast.LENGTH_SHORT).show();
             btn1.setBackgroundResource(R.drawable.bos);
             btn2.setBackgroundResource(R.drawable.bos);
             btn3.setBackgroundResource(R.drawable.bos);
             btn4.setBackgroundResource(R.drawable.bos);
             say = 0;
         }
     }
    }
}