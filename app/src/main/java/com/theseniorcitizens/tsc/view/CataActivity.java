package com.theseniorcitizens.tsc.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.theseniorcitizens.tsc.R;

public class CataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cata);
    }
    public void goHome(View view){
        Intent intent2 = new Intent(CataActivity.this,MainActivity.class);
        startActivity(intent2);
    }
    public void goCatagories(View view){
        Intent intent2 = new Intent(CataActivity.this,CataActivity.class);
        startActivity(intent2);
    }
    public void goSearch(View view){
        Intent intent2 = new Intent(CataActivity.this,SearchActivity.class);
        startActivity(intent2);
    }
    public void goCart(View view){
        Intent intent2 = new Intent(CataActivity.this,CartActivity.class);
        startActivity(intent2);
    }
}
