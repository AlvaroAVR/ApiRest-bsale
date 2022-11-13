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

@NoArgsConstructor//crea mediante lombok un contructor sin parametros
@AllArgsConstructor//crea un constructor con parametros, todos los argumentos
@Getter//crea los getter
@Setter//crea los setter
@Entity//especifica que la clase es una entidad correspondiente a una tabla de la base de datos
@Table(name = "product")//etiqueta para identificar a que tabla referncia esta entidad
public class Product {

	//atributos
	
	@Id//indica cual atributo es el id columna en la base de datos
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String urlImage;
	private float price;
	private Integer discount;
	
	@ManyToOne //indica que es una relacion muchos a uno 
	@JoinColumn(name = "category")//para indicar con que columna se une
	private Category category;
}