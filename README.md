# ApiRest Bsale Test
*** 
Aplicacion para producir un Api Rest para tienda en linea.
Su funcion es conectar con la base de datos para asi realizar las respectivas consultas y asi poder retornar los datos obtenidos en formato Json. 

Para esto se configura la coneccion en el application.properties con los datos proporcionados por Bsale.

Se crean las entidades con sus respectivos atributos y anotaciones, estas representaran las tablas de la base de datos.

![image](https://user-images.githubusercontent.com/101934732/201563574-c95e32c5-33c6-4257-b1b8-54f325e40616.png)
***

Se crean los repositorios de cada entidad, se aplican las query a cada metodo para asi realizar las consultas a la base de datos y obtener los datos deseados

![image](https://user-images.githubusercontent.com/101934732/201563095-9c3618d3-ae5d-465e-b0b3-c5ea7df0ae38.png)
***

Se crean los servicios y sus respectivas implementaciones 

![image](https://user-images.githubusercontent.com/101934732/201563791-1fdf5cf0-401d-44c8-82cc-6472ea2120e0.png)
![image](https://user-images.githubusercontent.com/101934732/201563854-10589db3-4bb5-4920-9ff4-884577a0a1be.png)
***

Se crea el controlador en donde mapeamos las rutas con las que se realizara la solicitud de los datos

![image](https://user-images.githubusercontent.com/101934732/201564002-0fdb050a-5ff3-473c-bed5-8dbe62c4826f.png)
***
##Consulta de datos.

Podemos realizar la consulta de todos los productos con la siguiente ruta https://apirest-bsale.herokuapp.com/api/v1/products/todos 

Como tambien podemos consultar una busqueda en especifico por ejemplo al buscar la palabra pisco la ruta quedaria de la siguiente manera:  https://apirest-bsale.herokuapp.com/api/v1/products/buscar?query=pisco

Al realizar una peticion recibiremos los datos en formato Json de la siguiente manera: 
![image](https://user-images.githubusercontent.com/101934732/201562536-bce04433-af7a-4b10-ab42-617e6fda9ba3.png)

Estos datos son tomados por el frontend para poder mostrar los productos en la tienda en linea.

Se puede revisar el repositorio del frontend en mis repositorios o directamente en el siguiente link: https://github.com/AlvaroAVR/frotend-bsale


