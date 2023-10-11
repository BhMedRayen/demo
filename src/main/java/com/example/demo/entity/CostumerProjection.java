package com.example.demo.entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="fullCostumer",types= Costumer.class)
public interface CostumerProjection extends Projection {
             public  long getId();
         public  String getName();
         public String getEmail();
}
