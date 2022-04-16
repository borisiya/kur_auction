package com.kursach.auction.repositor;

import  com.kursach.auction.model.Sale ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SaleRepository extends JpaRepository<Sale,Long>{
}
