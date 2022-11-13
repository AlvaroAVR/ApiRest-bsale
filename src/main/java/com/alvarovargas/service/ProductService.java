package com.alvarovargas.service;

import java.util.List;

import com.alvarovargas.model.Product;

public interface ProductService {
	
	public List<Product> listarProductos();
    
    public List<Product> buscarProductos(String query);
}
