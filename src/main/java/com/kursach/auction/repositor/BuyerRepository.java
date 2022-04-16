package com.kursach.auction.repositor;

import  com.kursach.auction.model.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BuyerRepository extends JpaRepository<Buyer,Long>{
}
