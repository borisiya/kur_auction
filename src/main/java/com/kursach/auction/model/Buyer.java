package com.kursach.auction.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table (name = "byer")
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBuyer")
    private Long idBuyer;

    @Column(name = "firstName",nullable = false, length = 64)
    private String firstName;

    @Column(name = "secondName",nullable = false, length = 64)
    private String secondName;

    @Column(name = "fatherName",nullable = false, length = 64)
    private String fatherName;

    @Column(name = "sex",length = 64)
    private String sex;

    @Column(name = "phone",nullable = false, length = 64)
    private Integer phone;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "buyer")
    private Sale sale;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "buyer")
    private Users users;

    public Buyer(){}

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }


    public Integer getPhone() {
        return phone;
    }
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFatherName() {
        return fatherName;
    }
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Long getIdBuyer() {
        return idBuyer;
    }
    public void setIdBuyer(Long idBuyer) {
        this.idBuyer = idBuyer;
    }

    public Users getUsers() {
        return users;
    }
    public void setUsers(Users users) {
        this.users = users;
    }

    public Sale getSale() {
        return sale;
    }
    public void setSale(Sale sale) {
        this.sale = sale;
    }
}
