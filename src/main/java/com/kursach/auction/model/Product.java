package com.kursach.auction.model;

import javax.persistence.*;


@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProduct")
    private Long idProduct;

    @Column(name = "nameProduct",nullable = false)
    private String nameProduct;

    @Column(name = "images",nullable = false)
    private String images;

    @Column(name = "startpriceProduct",nullable = false)
    private Double startpriceProduct;



    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private Author author;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Sale sale;

    public Product(){}

    public Long getIdProduct() {
        return idProduct;
    }
    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Double getStartPriceProduct() {
        return startpriceProduct;
    }
    public void setStartPriceProduct(Double startpriceProduct) {
        this.startpriceProduct = startpriceProduct;
    }

    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }
    public Sale getSale() {
        return sale;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }


}
