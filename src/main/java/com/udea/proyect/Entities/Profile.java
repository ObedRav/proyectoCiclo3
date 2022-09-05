package com.udea.proyect.Entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profile")
public class Profile {
    @Id
    private String id;
    @Column
    private String image;
    @Column
    private String phone;
    @Column
    private LocalDate createdAt;
    @Column
    private LocalDate updatedAt;

    public Profile(String id, String image, String phone, LocalDate createdAt, LocalDate updatedAt) {
        this.id = id;
        this.image = image;
        this.phone = phone;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    } 


    public String toString() {
        return ("Profile {id=" + id + ", image=" + image + ", phone=" + phone + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "}");
}
}
