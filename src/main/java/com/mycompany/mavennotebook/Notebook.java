package com.mycompany.mavennotebook;

import asg.cliche.Command;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notebook {
    private List<Record> recordNotebook = new ArrayList<>();
    
    @Command
    public void create (String firstName, String lastName, String phone){
        Record tempRecord = new Record();
        tempRecord.setFirstName(firstName);
        tempRecord.setLastName(lastName);
        tempRecord.setPhones(phone);
        recordNotebook.add(tempRecord);
    }
    
    @Command
    public void remove(int id){
        try{
            recordNotebook.remove(id-1);
        } catch (IndexOutOfBoundsException e){
           System.out.printf(id + " no record in notebook\n");  
        }
    }
    
    @Command
    public void addphone (int id, String phoneAdd){
        try{
            Record tempRecord = new Record();
            tempRecord=recordNotebook.get(id-1);
            tempRecord.setPhones(phoneAdd);
            recordNotebook.set(id-1, tempRecord);
        } catch (IndexOutOfBoundsException e){
            System.out.printf(id + " no record in notebook\n");            
        }
    }
    
    @Command
    public void addemail (int id, String emailAdd){
        try{
            Record tempRecord = new Record();
            tempRecord=recordNotebook.get(id-1);
            tempRecord.setEmail(emailAdd);
            recordNotebook.set(id-1, tempRecord);
        } catch (IndexOutOfBoundsException e){
            System.out.printf(id + " no record in notebook\n");            
        }
    }
    
    @Command
    public void addaddress (int id){
        try{
            Scanner addressScanner=new Scanner(System.in);
            System.out.println("Please enter full address");
            String address=addressScanner.nextLine();
            Record tempRecord = new Record();
            tempRecord=recordNotebook.get(id-1);
            tempRecord.setAddress(address);
            recordNotebook.set(id-1, tempRecord);
        } catch (IndexOutOfBoundsException e){
             System.out.printf(id + " no record in notebook\n"); 
        }
    }
    
    @Command
    public List<Record> show(){
        return recordNotebook;
    }
    
    @Command
    public Record showid(int id){
        try{
            Record tempRecord = new Record();
            tempRecord=recordNotebook.get(id-1);
            return tempRecord;
        } catch (IndexOutOfBoundsException e){
            System.out.printf(id + " no record in notebook\n");            
        }
        return null;
    }
}
