package com.kursach.auction.model;

import javax.persistence.*;

@Entity
@Table(name = "admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idAdm")
    private Long idAdm;

    @Column(name = "emailAdm",nullable = false, unique = true, length = 45)
    private String emailAdm;

    @Column(name = "passwordAdm",nullable = false, length = 64)
    private String passwordAdm;

    public Admin(){}
    public Admin(Long idAdm, String emailAdm, String passwordAdm){
        this.idAdm=idAdm;
        this.emailAdm=emailAdm;
        this.passwordAdm=passwordAdm;
    }

    public Long getId() {
        return idAdm;
    }
    public void setId(Long idAdm) {
        this.idAdm = idAdm;
    }

    public String getEmail() {
        return emailAdm;
    }
    public void setEmail(String emailAdm) {
        this.emailAdm = emailAdm;
    }

    public String getPassword() {
        return passwordAdm;
    }
    public void setPassword(String passwordAdm) {
        this.passwordAdm = passwordAdm;
    }
}
