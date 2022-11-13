package com.alvarovargas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product")//etiqueta para identificar a que tabla referncia esta entidad
public class Product {

	@Id//etiqueta para asignar el id de la entidad 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String urlImage;
	private float price;
	private Integer discount;
	
	@ManyToOne
	@JoinColumn(name = "category")
	private Category category;
}