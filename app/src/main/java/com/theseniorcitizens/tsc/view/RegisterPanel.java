package com.theseniorcitizens.tsc.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.theseniorcitizens.tsc.R;
import com.theseniorcitizens.tsc.controller.UserController;

public class RegisterPanel extends AppCompatActivity implements View.OnClickListener {
    Button bRegister;
    EditText etMail, etName, etSurname, etPhone, etAddress, etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_panel);
        etMail = findViewById(R.id.etEmail);
        etName = findViewById(R.id.etName);
        etSurname = findViewById(R.id.etSurname);
        etPhone = findViewById(R.id.etPhone);
        etAddress = findViewById(R.id.etAddress);
        etPassword = findViewById(R.id.etPassword);
        bRegister = findViewById(R.id.bRegister);
        bRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.bRegister:
                UserController us =new UserController();
                us.addNewUser(etName.toString(), etSurname.toString(), etPassword.toString(), etMail.toString(), etPhone.toString(), etAddress.toString());
                break;



        }


    }

    public void goUserPanel(View view) {
        Intent intent = new Intent(RegisterPanel.this, UserPanel.class);
        startActivity(intent);

    }
    public void goHome(View view){
        Intent intent2 = new Intent(RegisterPanel.this,MainActivity.class);
        startActivity(intent2);
    }
    public void goCatagories(View view){
        Intent intent2 = new Intent(RegisterPanel.this,CataActivity.class);
        startActivity(intent2);
    }
    public void goSearch(View view){
        Intent intent2 = new Intent(RegisterPanel.this,SearchActivity.class);
        startActivity(intent2);
    }
    public void goCart(View view){
        Intent intent2 = new Intent(RegisterPanel.this,CartActivity.class);
        startActivity(intent2);
    }
}
