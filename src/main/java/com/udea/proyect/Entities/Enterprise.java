package com.udea.proyect.Entities;

import java.time.LocalDate;
import java.util.ArrayList;


public class Enterprise {
    private String name, document, phone, address;
    private int id;
    private ArrayList<Employee> users;
    private ArrayList<Transaction> transactions;
    private LocalDate createdAt;
    private LocalDate updatedAt;


    public Enterprise(String name, String document, String phone, String address, int id, LocalDate createdAt, LocalDate updatedAt) {
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
        this.id = id;
        this.users = new ArrayList<Employee>();
        this.transactions = new ArrayList<Transaction>();
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
         this.name = name;
    }

    public String getDocument() {  
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addUser(Employee user) {
        users.add(user);
    }
 
    public Employee getPositionUser (int posicion) { 
        try {
            if (posicion >= 0 && posicion < users.size() ) {
                return users.get(posicion); }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    public int getTamañoUsers () { 
        return users.size(); 
    }
 
    public void removeUsers(int posicion) {  
        if (posicion >= 0 && posicion < users.size() ) {
            users.remove(posicion); }
        else { } 
    } 

    public void addTransactions(Transaction transaction) {
        transactions.addAll(transactions);
    }
 
    public Transaction getPositionTransactions (int posicion) { 
        try {
            if (posicion >= 0 && posicion < transactions.size() ) {
                return transactions.get(posicion); }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    public int getTamañoTransactions () { 
        return transactions.size(); 
    }
 
    public void removeTransaction (int posicion) {  
        if (posicion >= 0 && posicion < transactions.size() ) {
            transactions.remove(posicion); }
        else { } 
    } 

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String toString() {
        return ("Enterprise {name=" + name + ", document=" + document + ", phone=" + phone + ", adress=" + address + ", id=" + id + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "}");

}
}
    
