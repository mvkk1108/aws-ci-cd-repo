package com.krishna.awspipeline.repos;

import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import com.krishna.awspipeline.model.Product;

@Component
public class ProductRepo {

	
	public List<Product> getProducts()
	{
		
		
	return	Stream.of(
			new Product(1, "RAM", "DDR", 8000),
			new Product(2, "Laptop", "Dell", 81000),
			new Product(3, "Desktop", "I3 HP", 78000),
			new Product(5, "Mobile", "Samsung", 18000)
			
			
			
			
			)
		.collect(Collectors.toList());
		
	}
}
