package com.alvarovargas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvarovargas.model.Product;
import com.alvarovargas.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired//inyeccion de dependencias para ProductService
	private ProductRepository productRepository;
	
	@Override
	public List<Product> listarProductos() {
		List<Product> productos = productRepository.listarProductos();//buscando todos los productos a traves de productRepository
    	return productos; // retorna la lista de todos los productos
	}

	@Override
	public List<Product> buscarProductos(String query) {
		List<Product> products = productRepository.buscarProductos(query);//buscando los productos que coincidan con el parametro enviado a traves de productRepository
		return products;//retorna el listado de productos que coincidan con la busqueda
	}
}
