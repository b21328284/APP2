package com.theseniorcitizens.tsc.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.theseniorcitizens.tsc.R;
import com.theseniorcitizens.tsc.model.Book;

public class EditBook extends AppCompatActivity {
    Book b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_book);

        b = (Book) getIntent().getSerializableExtra("book");
        ((EditText)findViewById(R.id.NamePlain)).setHint(b.bookName);
        ((EditText)findViewById(R.id.AuthorPlain)).setHint(b.author);
        ((EditText)findViewById(R.id.publishedyearPlain)).setHint(String.valueOf(b.publishedYear));
        ((EditText)findViewById(R.id.Publishertext)).setHint(b.publisher);
        ((EditText)findViewById(R.id.PriceText)).setHint(String.valueOf(b.price) );
        ((EditText)findViewById(R.id.NumberOfPagesText)).setHint(String.valueOf(b.numberOfPages));
        ((EditText)findViewById(R.id.LanguageText)).setHint(b.language);
        ((EditText)findViewById(R.id.SkinTypetext)).setHint(b.skinType);
        ((EditText)findViewById(R.id.NumberofPrintsText)).setHint(String.valueOf(b.numberOfPrints));
        ((EditText)findViewById(R.id.description)).setHint(b.description);
    }
    public void deleteBook(View view){
        DatabaseReference books= FirebaseDatabase.getInstance().getReference("Books").child(b.Id);
        books.removeValue();
        Toast.makeText(this,"Book is deleted",Toast.LENGTH_LONG).show();
    }
    public void changeBookName(View view){
        b.bookName = ((EditText)findViewById(R.id.NamePlain)).getText().toString();
        FirebaseDatabase.getInstance().getReference("Books").child(b.Id).setValue(b);
    }
    public void changeAuthor(View view){
        b.author = ((EditText)findViewById(R.id.AuthorPlain)).getText().toString();
        FirebaseDatabase.getInstance().getReference("Books").child(b.Id).setValue(b);
    }
    public void changeYear(View view){
        b.publishedYear = Integer.parseInt(((EditText)findViewById(R.id.publishedyearPlain)).getText().toString());
        FirebaseDatabase.getInstance().getReference("Books").child(b.Id).setValue(b);
    }
    public void changePublisher(View view){
        b.publisher = ((EditText)findViewById(R.id.Publishertext)).getText().toString();
        FirebaseDatabase.getInstance().getReference("Books").child(b.Id).setValue(b);
    }
    public void changePrice(View view){
        b.price = Double.parseDouble(((EditText)findViewById(R.id.PriceText)).getText().toString());
        FirebaseDatabase.getInstance().getReference("Books").child(b.Id).setValue(b);
    }
    public void changePages(View view){
        b.numberOfPages = Integer.parseInt(((EditText)findViewById(R.id.NumberOfPagesText)).getText().toString());
        FirebaseDatabase.getInstance().getReference("Books").child(b.Id).setValue(b);
    }
    public void changeLanguage(View view){
        b.language =((EditText)findViewById(R.id.LanguageText)).getText().toString();
        FirebaseDatabase.getInstance().getReference("Books").child(b.Id).setValue(b);
    }
    public void changeSkin(View view){
        b.skinType = ((EditText)findViewById(R.id.SkinTypetext)).getText().toString();
        FirebaseDatabase.getInstance().getReference("Books").child(b.Id).setValue(b);
    }
    public void changePrints(View view){
        b.numberOfPrints = Integer.parseInt(((EditText)findViewById(R.id.NumberofPrintsText)).getText().toString());
        FirebaseDatabase.getInstance().getReference("Books").child(b.Id).setValue(b);
    }
    public void changeDesc(View view){
        b.description =((EditText)findViewById(R.id.description)).getText().toString();
        FirebaseDatabase.getInstance().getReference("Books").child(b.Id).setValue(b);
    }
    public void goHome(View view){
        Intent intent2 = new Intent(EditBook.this,MainActivity.class);
        startActivity(intent2);
    }
    public void goCatagories(View view){
        Intent intent2 = new Intent(EditBook.this,CataActivity.class);
        startActivity(intent2);
    }
    public void goSearch(View view){
        Intent intent2 = new Intent(EditBook.this,SearchActivity.class);
        startActivity(intent2);
    }
    public void goCart(View view){
        Intent intent2 = new Intent(EditBook.this,CartActivity.class);
        startActivity(intent2);
    }
}
