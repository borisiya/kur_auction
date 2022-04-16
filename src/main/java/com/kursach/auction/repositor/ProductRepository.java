package com.kursach.auction.repositor;

import  com.kursach.auction.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends  JpaRepository<Product,Long>{
}
