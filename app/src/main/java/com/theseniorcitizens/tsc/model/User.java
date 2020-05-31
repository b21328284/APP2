package com.theseniorcitizens.tsc.model;
import java.util.ArrayList;
public class User {
    private int id;
    private String fName;
    private String surname;
    private String email;
    private int addressId;
    private String phone;
    private Boolean isAdmin;
    private ArrayList<Integer> myComments;
    private String password;
    private int classId=1;



public User(String fName, String surname, String password, String email,String phone, String address){
    this.id = classId++;
    this.fName = fName;
    this.surname = surname;
    this.password = password;
    this.email = email;
    this.phone = phone;
    //this.addressID = new Address(address).getAId();
    this.isAdmin = false;
    this.myComments = new ArrayList<Integer>();


}



}