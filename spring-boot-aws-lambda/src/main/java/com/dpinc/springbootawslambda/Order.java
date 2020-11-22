package com.dpinc.springbootawslambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {

    private int id;
    private String name;
    private double price;
    private int quantity;	
}
