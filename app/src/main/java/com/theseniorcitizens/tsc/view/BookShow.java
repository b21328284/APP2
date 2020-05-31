package com.theseniorcitizens.tsc.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.theseniorcitizens.tsc.R;
import com.theseniorcitizens.tsc.model.Book;

public class BookShow extends AppCompatActivity {
    Book book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_show);
        book= (Book)getIntent().getSerializableExtra("book");
        ((TextView)findViewById(R.id.textView9)).setText(book.bookName);
        ((TextView)findViewById(R.id.textView12)).setText(book.author);
        ((TextView)findViewById(R.id.textView18)).setText(book.description);
        ((TextView)findViewById(R.id.textView19)).setText(String.valueOf(book.price)+" TL");
        ((TextView)findViewById(R.id.textView14)).setText(book.language);
        ((TextView)findViewById(R.id.textView13)).setText(String.valueOf(book.numberOfPages));
        ((TextView)findViewById(R.id.textView17)).setText(String.valueOf(book.numberOfPrints));
        ((TextView)findViewById(R.id.textView11)).setText(book.publisher);
        ((TextView)findViewById(R.id.textView15)).setText(book.skinType);
        ((TextView)findViewById(R.id.textView10)).setText(String.valueOf(book.publishedYear));
    }

    public void goHome(View view){
        Intent intent2 = new Intent(BookShow.this,MainActivity.class);
        startActivity(intent2);
    }
    public void goCatagories(View view){
        Intent intent2 = new Intent(BookShow.this,CataActivity.class);
        startActivity(intent2);
    }
    public void goSearch(View view){
        Intent intent2 = new Intent(BookShow.this,SearchActivity.class);
        startActivity(intent2);
    }
    public void goCart(View view){
        Intent intent2 = new Intent(BookShow.this,CartActivity.class);
        startActivity(intent2);
    }
}
