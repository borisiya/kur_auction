package com.kursach.auction.model;

import javax.persistence.*;
import java.util.Collection;


@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAuthor")
    private Integer idAuthor;

    @Column(name = "firstNameAuthor",nullable = false, length = 64)
    private String firstNameAuthor;

    @Column(name = "secondNameAuthor",nullable = false, length = 64)
    private String secondNameAuthor;

    @Column(name = "fatherNameAuthor",nullable = false, length = 64)
    private String fatherNameAuthor;

    @Column(name = "phoneAuthor",nullable = false, length = 64)
    private Integer phoneAuthor;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "author", fetch = FetchType.EAGER)
    private Collection<Product> productCollection;

    public Author(){}

    public Integer getIdAuthor() {
        return idAuthor;
    }
    public void setIdAuthor(Integer idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getFirstNameAuthor() {
        return firstNameAuthor;
    }
    public void setFirstNameAuthor(String firstNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
    }

    public String getSecondNameAuthor() {
        return secondNameAuthor;
    }
    public void setSecondNameAuthor(String secondNameAuthor) {
        this.secondNameAuthor = secondNameAuthor;
    }

    public String getFatherNameAuthor() {
        return fatherNameAuthor;
    }
    public void setFatherNameAuthor(String fatherNameAuthor) {
        this.fatherNameAuthor = fatherNameAuthor;
    }

    public Integer getPhoneAuthor() {
        return phoneAuthor;
    }
    public void setPhoneAuthor(Integer phoneAuthor) {
        this.phoneAuthor = phoneAuthor;
    }

    public Collection<Product> getProductCollection() {
        return productCollection;
    }
    public void setProductCollection(Collection<Product> productCollection) {
        this.productCollection = productCollection;
    }
}
