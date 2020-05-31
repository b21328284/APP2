package com.theseniorcitizens.tsc.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.theseniorcitizens.tsc.R;

public class loginactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void goUserPanel(View view) {
        Intent intent = new Intent(loginactivity.this, UserPanel.class);
        startActivity(intent);

    }
    public void goRegPanel(View view) {
        Intent intent2 = new Intent(loginactivity.this, RegisterPanel.class);
        startActivity(intent2);

    }
    public void goHome(View view){
        Intent intent2 = new Intent(loginactivity.this,MainActivity.class);
        startActivity(intent2);
    }
    public void goCatagories(View view){
        Intent intent2 = new Intent(loginactivity.this,CataActivity.class);
        startActivity(intent2);
    }
    public void goSearch(View view){
        Intent intent2 = new Intent(loginactivity.this,SearchActivity.class);
        startActivity(intent2);
    }
    public void goCart(View view){
        Intent intent2 = new Intent(loginactivity.this,CartActivity.class);
        startActivity(intent2);
    }
}
