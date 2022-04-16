package com.kursach.auction.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idUs")
    private Long idUs;

    @Column(name = "emailUs",nullable = false, unique = true, length = 45)
    private String emailUs;

    @Column(name = "passwordUs",nullable = false, length = 64)
    private String passwordUs;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "buyerId", referencedColumnName = "idBuyer") //@JoinColumn  — применяется когда внешний ключ находится в одной из сущностей.Но рекомендуется применять в сущности, которая является владельцем физической информации
    private Buyer buyer;



    public Users(){}
    public  Users(Long idUs,String emailUs, String passwordUs){
        this.idUs=idUs;
        this.emailUs=emailUs;
        this.passwordUs=passwordUs;
    }

    public Buyer getBuyer() {
        return buyer;
    }
    public void setBuyer (Buyer buyer) {
        this.buyer = buyer;
    }

    public Long getId() {
        return idUs;
    }
    public void setId(Long idUs) {
        this.idUs = idUs;
    }

    public String getEmail() {
        return emailUs;
    }
    public void setEmail(String emailUs) {
        this.emailUs = emailUs;
    }

    public String getPassword() {
        return passwordUs;
    }
    public void setPassword(String passwordUs) {
        this.passwordUs = passwordUs;
    }

}
