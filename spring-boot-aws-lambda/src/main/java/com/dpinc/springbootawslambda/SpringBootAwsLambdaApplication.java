package com.dpinc.springbootawslambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootAwsLambdaApplication {

	@Autowired
    private OrderDao orderDao;

    @Bean
    public Supplier<List<Order>> orders() {
        return () -> orderDao.prepareOrders();
    }

    @Bean
    public Function<String, List<Order>> findOrderByName() {
        return (input) -> orderDao.prepareOrders()
        		.stream()
        		.filter(order -> order.getName().equals(input))
        		.collect(Collectors.toList());
    }
	
    public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsLambdaApplication.class, args);
	}
}
