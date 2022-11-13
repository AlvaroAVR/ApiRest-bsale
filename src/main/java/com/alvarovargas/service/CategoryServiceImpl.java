package com.alvarovargas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvarovargas.model.Category;
import com.alvarovargas.repository.CategoryRepository;

@Service//declarando y configurando una clase de servicio Spring
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired//inyeccion de dependencias del repositorio CategoryRepository
	private CategoryRepository categoryRepository;

	@Override
	public List<Category> listarCategory() {
		return categoryRepository.findAll();//retorna todas las categorias a traves de categoryRepository
	}

}
