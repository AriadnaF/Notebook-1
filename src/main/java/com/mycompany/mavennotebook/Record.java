package com.mycompany.mavennotebook;

import java.util.ArrayList;
import java.util.List;

public class Record {
    private static int counter=0;
    
    private String firstName;
    private String lastName;
    private List<String> phones = new ArrayList<>();
    private String address="Unknown";
    private String email="Unknown";
    private int id;

    @Override
    public String toString() {
        return "Record"
                + "[id=" + id
                + " firstName=" + firstName
                + " lastName=" + lastName
                + " phone=" + phones
                + " address=" + address
                + " email=" + email + ']';
    }
           
    public Record(){
        counter++;
        id=counter;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getPhone() {
        return phones;
    }

    public void setPhones(String phone) {
        phones.add(phone);
    }
    
     public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
        
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }
}
