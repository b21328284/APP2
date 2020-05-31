package com.theseniorcitizens.tsc.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.theseniorcitizens.tsc.R;
import com.theseniorcitizens.tsc.model.Book;
import java.util.HashMap;
import java.util.Map;

public class Addbook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addbook);
    }
    public void addBook(View view){
        try {
        String bookName = ((EditText)findViewById(R.id.bookName)).getText().toString();
        String author = ((EditText)findViewById(R.id.author)).getText().toString();
        String year = ((EditText)findViewById(R.id.year)).getText().toString();
        String definition = ((EditText)findViewById(R.id.definition)).getText().toString();
        String publisher = ((EditText)findViewById(R.id.publisher)).getText().toString();
        String skinType = ((EditText)findViewById(R.id.skinType)).getText().toString();
        String language = ((EditText)findViewById(R.id.language)).getText().toString();
        int numberOfPages = Integer.parseInt(((EditText) findViewById(R.id.NumberOfPages)).getText().toString());
        double price = Double.parseDouble(((EditText) findViewById(R.id.price)).getText().toString());
        int numberOfPrints = Integer.parseInt(((EditText) findViewById(R.id.numberOfPrints)).getText().toString());

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Books");
        String id=myRef.push().getKey();
        Book b1=new Book(id, bookName, author, Integer.parseInt(year),publisher, price, numberOfPages, definition, numberOfPrints, skinType, language);

        if (b1.isEmpty() & year.length()==4){

            myRef.child(id).setValue(b1);
        }
        else{
            Toast.makeText(this,"Invalid values",Toast.LENGTH_LONG).show();
            }
        }
        catch (NumberFormatException e) {
            Toast.makeText(this,"Invalid values",Toast.LENGTH_LONG).show();
        }
    }
    public void goHome(View view){
        Intent intent2 = new Intent(Addbook.this,MainActivity.class);
        startActivity(intent2);
    }
    public void goCatagories(View view){
        Intent intent2 = new Intent(Addbook.this,CataActivity.class);
        startActivity(intent2);
    }
    public void goSearch(View view){
        Intent intent2 = new Intent(Addbook.this,SearchActivity.class);
        startActivity(intent2);
    }
    public void goCart(View view){
        Intent intent2 = new Intent(Addbook.this,CartActivity.class);
        startActivity(intent2);
    }
}
