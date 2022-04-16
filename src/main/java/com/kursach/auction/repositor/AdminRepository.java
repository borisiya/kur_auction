package com.kursach.auction.repositor;

import  com.kursach.auction.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface AdminRepository extends JpaRepository<Admin,Long>{
}
