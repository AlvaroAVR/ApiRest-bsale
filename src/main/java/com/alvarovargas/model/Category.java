package com.alvarovargas.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor//crea mediante lombok un constructor sin parametros
@AllArgsConstructor//crea un constructor con parametros
@Getter//crea los getter
@Setter//crea los setter
@Entity//especifica que la clase es una entidad correspondiente a una tabla de la base de datos
@Table(name = "category")//identifica a que tabla referencia esta entidad
public class Category {
	
	//atributos
	
	@Id//indica cual atributo es el id columna en la base de datos
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	
	@OneToMany(mappedBy = "category")//indica que es una rrelacion 1 a muchos
	@JsonIgnore//para ignorar este listado en el json y no tener tantos datos
	private List<Product> productos;
}
