// ProductoController.java
package com.ecommerce.controller;

import com.ecommerce.config.Configuracion;
import com.ecommerce.dao.ProductoDAO;
import com.ecommerce.factory.DatabaseFactory;
import com.ecommerce.model.Producto;

import java.util.List;

public class ProductoController {
    private ProductoDAO productoDAO;

    public ProductoController(String dbType) {
        DatabaseFactory factory = Configuracion.configureAdapterDB(dbType);
        productoDAO = factory.crearProductoDAO();
    }

    public void agregarProducto(Producto producto) {
        productoDAO.agregarProducto(producto);
    }

    public List<Producto> listarProductos() {
        return productoDAO.listarProductos();
    }
}
