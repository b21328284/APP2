package com.theseniorcitizens.tsc.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.theseniorcitizens.tsc.R;

public class UserPanel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_panel);
    }
    public void goHome(View view){
        Intent intent2 = new Intent(UserPanel.this,MainActivity.class);
        startActivity(intent2);
    }
    public void goCatagories(View view){
        Intent intent2 = new Intent(UserPanel.this,CataActivity.class);
        startActivity(intent2);
    }
    public void goSearch(View view){
        Intent intent2 = new Intent(UserPanel.this,SearchActivity.class);
        startActivity(intent2);
    }
    public void goCart(View view){
        Intent intent2 = new Intent(UserPanel.this,CartActivity.class);
        startActivity(intent2);
    }
    public void goaddbook(View view){
        Intent intent2 = new Intent(UserPanel.this,Addbook.class);
        startActivity(intent2);
    }
    public void goeditpage(View view){
        Intent intent2 = new Intent(UserPanel.this,EditBook.class);
        startActivity(intent2);
    }
    public void goeditpanel(View view){
        Intent intent2 = new Intent(UserPanel.this,EditPanel.class);
        startActivity(intent2);
    }
}
