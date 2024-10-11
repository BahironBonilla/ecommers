// MySQLProductoDAO.java
package com.ecommerce.dao;

import com.ecommerce.model.Producto;
import java.util.ArrayList;
import java.util.List;

public class MySQLProductoDAO implements ProductoDAO {
    private List<Producto> productos = new ArrayList<>();

    public MySQLProductoDAO() {
        // Datos de prueba
        productos.add(new Producto(1, "Laptop", 800.0));
        productos.add(new Producto(2, "Teléfono", 500.0));
        productos.add(new Producto(3, "Tablet", 300.0));
    }

    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public void actualizarProducto(Producto producto) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == producto.getId()) {
                productos.set(i, producto);
                return;
            }
        }
    }

    @Override
    public void eliminarProducto(int id) {
        productos.removeIf(producto -> producto.getId() == id);
    }

    @Override
    public Producto obtenerProducto(int id) {
        return productos.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Producto> listarProductos() {
        return productos;
    }
}
