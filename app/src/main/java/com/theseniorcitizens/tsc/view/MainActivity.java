package com.theseniorcitizens.tsc.view;

        import androidx.annotation.NonNull;
        import androidx.annotation.Nullable;
        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.view.Window;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;

        import com.google.firebase.database.ChildEventListener;
        import com.google.firebase.database.DataSnapshot;
        import com.google.firebase.database.DatabaseError;
        import com.google.firebase.database.DatabaseReference;
        import com.google.firebase.database.FirebaseDatabase;
        import com.google.firebase.database.ValueEventListener;
        import com.theseniorcitizens.tsc.R;
        import com.theseniorcitizens.tsc.model.Book;

        import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private DatabaseReference mDatabase;
    ListView listView;
    ArrayList<Book>  arrayList = new ArrayList<>();
    ArrayAdapter<Book> arrayAdapter;
    Book book;
    Book selected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.booksList);
        mDatabase = FirebaseDatabase.getInstance().getReference("Books");
        arrayAdapter = new ArrayAdapter<Book>(this,R.layout.book_info,R.id.booksTv,arrayList);
        book = new Book();
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                arrayList.clear();
                for(DataSnapshot ds: dataSnapshot.getChildren()){
                        book = ds.getValue(Book.class);
                        arrayList.add(book);
                }
                listView.setAdapter(arrayAdapter);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,BookShow.class);
                Book chosen =  arrayList.get(position);
                intent.putExtra("book",chosen);
                startActivity(intent);
            }
        });

}
    public void goDetails(View view){

    }
    public void deleteBook(View view){

    }
    public void LoginPanel(View view){
        Intent intent = new Intent(MainActivity.this,loginactivity.class);
        startActivity(intent);
    }
    public void goHome(View view){
        Intent intent2 = new Intent(MainActivity.this,MainActivity.class);
        startActivity(intent2);
    }
    public void goCatagories(View view){
        Intent intent2 = new Intent(MainActivity.this,CataActivity.class);
        startActivity(intent2);
    }
    public void goSearch(View view){
        Intent intent2 = new Intent(MainActivity.this,SearchActivity.class);
        startActivity(intent2);
    }
    public void goCart(View view){
        Intent intent2 = new Intent(MainActivity.this,CartActivity.class);
        startActivity(intent2);
    }
}
