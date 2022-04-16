package com.kursach.auction.repositor;

import  com.kursach.auction.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
