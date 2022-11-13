package com.alvarovargas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alvarovargas.model.Product;
import com.alvarovargas.service.ProductService;

@RestController//etiqueta para que spring configure esta clase como controlador rest
@RequestMapping("/api/v1/products")//ruta o mapping por defecto de la clase
public class HomeController {

	@Autowired//etiqueta para la inyeccion de dependencias para ProductService
	private ProductService productService;
	
	@GetMapping("/todos")//ruta o mapping al que respondera el metodo para mostrar todos los productos
    public ResponseEntity<List<Product>> todos(){
    	return ResponseEntity.ok(productService.listarProductos());//mediante productService se llama al metodo para listar todos los productos
    }
    
    @GetMapping("/buscar")//ruta o mapping al que respondera el metodo para mostrar el producto buscado
    public ResponseEntity<List<Product>> buscarProductos(@RequestParam("query") String query){
    	return ResponseEntity.ok(productService.buscarProductos(query));//mediante productService se llama al metodo para buscar un producto pasandole el parametro a buscar
    }
}