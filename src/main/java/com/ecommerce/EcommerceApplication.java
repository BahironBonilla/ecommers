// EcommerceApplication.java
package com.ecommerce;

import com.ecommerce.controller.ProductoController;
import com.ecommerce.model.Producto;

public class EcommerceApplication {
	public static void main(String[] args) {
		ProductoController controller = new ProductoController("mysql");
		ProductoController controller2 = new ProductoController("oracle");

		// Agregar un nuevo producto a my sql
		controller.agregarProducto(new Producto(4, "Auriculares", 100.0));

		// Agregar un nuevo producto a my sql
		controller.agregarProducto(new Producto(4, "Auriculares bluetooth", 100.0));

		// Listar productos
		controller.listarProductos().forEach(System.out::println);

		controller2.listarProductos().forEach(System.out::println);
	}
}
