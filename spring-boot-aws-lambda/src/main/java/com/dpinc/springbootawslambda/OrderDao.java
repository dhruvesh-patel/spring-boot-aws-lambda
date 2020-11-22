package com.dpinc.springbootawslambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {

	public List<Order> prepareOrders(){
        return Stream.of(
                new Order(101, "Milk", 20, 2),
                new Order(102, "Yogurt", 15, 4),
                new Order(103, "Juice", 25, 1),
                new Order(104, "Beans", 35, 5)
        ).collect(Collectors.toList());
    }
	
}
