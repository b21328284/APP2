package com.theseniorcitizens.tsc.controller;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.theseniorcitizens.tsc.model.User;

public class UserController {

    public void addNewUser(String fName, String surname, String password, String email,String phone, String address){

        User user= new User(fName, surname, password, email, phone, address);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("User");


    }


}
