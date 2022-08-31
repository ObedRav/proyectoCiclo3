package com.udea.proyect.Clases;

import java.util.Date;



public class Transaction {
    private double amount;
    private int id;
    private String concept;
    private Employee user;
    private Enterprise enterprise;
    private Date updatedAt, createdAt;

    public Transaction (int id, String concept, double amount, Employee user, Enterprise enterprise, Date createdAt, Date  updatedAt) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.user = user;
        this.enterprise = enterprise;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
         this.concept = concept;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Employee user() {
        return user;
    }

    public void setUser(Employee user) {
        this.user = user;
    }

    public Enterprise enterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String toString() {
        return ("id=" + id + ", concept=" + concept + ",amount=" + amount + ", user=" + user +", enterprise=" + enterprise + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt +")");
    
}
}