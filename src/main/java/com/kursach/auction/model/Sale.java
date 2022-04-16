package com.kursach.auction.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAuthor")
    private Long idSales;

    @Column(name = "priceSales",nullable = false)
    private Double priceSales;

    @Temporal(TemporalType.DATE)
    @Column(name = "date",nullable = false)
    private Date date;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "buyerId", referencedColumnName = "idBuyer")
    private Buyer buyer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "productId", referencedColumnName = "idProduct")
    private Product product;


    public Sale(){}

    public Double getPriceSales() {
        return priceSales;
    }
    public void setPriceSales(Double priceSales) {
        this.priceSales = priceSales;
    }

    public Long getIdSales() {
        return idSales;
    }
    public void setIdSales(Long idSales) {
        this.idSales = idSales;
    }


    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    public Buyer getBuyer() {
        return buyer;
    }
    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
