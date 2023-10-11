package com.example.demo.repository;


import com.example.demo.entity.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface CostumerRepository extends JpaRepository<Costumer,Long> {

}
