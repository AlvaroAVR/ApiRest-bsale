package com.alvarovargas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvarovargas.model.Product;
import com.alvarovargas.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> listarProductos() {
		List<Product> productos = productRepository.listarProductos();
    	return productos;
	}

	@Override
	public List<Product> buscarProductos(String query) {
		List<Product> products = productRepository.buscarProductos(query);
		return products;
	}
}
