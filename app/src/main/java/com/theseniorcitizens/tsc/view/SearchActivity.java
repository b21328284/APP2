package com.theseniorcitizens.tsc.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.theseniorcitizens.tsc.R;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }
    public void goHome(View view){
        Intent intent2 = new Intent(SearchActivity.this,MainActivity.class);
        startActivity(intent2);
    }
    public void goCatagories(View view){
        Intent intent2 = new Intent(SearchActivity.this,CataActivity.class);
        startActivity(intent2);
    }
    public void goSearch(View view){
        Intent intent2 = new Intent(SearchActivity.this,SearchActivity.class);
        startActivity(intent2);
    }
    public void goCart(View view){
        Intent intent2 = new Intent(SearchActivity.this,CartActivity.class);
        startActivity(intent2);
    }
}
