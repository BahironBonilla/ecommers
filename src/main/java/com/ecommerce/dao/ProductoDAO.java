// ProductoDAO.java
package com.ecommerce.dao;

import com.ecommerce.model.Producto;
import java.util.List;

public interface ProductoDAO {
    void agregarProducto(Producto producto);

    void actualizarProducto(Producto producto);

    void eliminarProducto(int id);

    Producto obtenerProducto(int id);

    List<Producto> listarProductos();
}
