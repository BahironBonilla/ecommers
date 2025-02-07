// OracleProductoDAO.java
package com.ecommerce.dao;

import com.ecommerce.model.Producto;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OracleProductoDAO implements ProductoDAO {
    private Map<Integer, Producto> productos = new HashMap<>();

    public OracleProductoDAO() {
        // Datos de prueba
        productos.put(1, new Producto(1, "Laptop", 800.0));
        productos.put(2, new Producto(2, "Teléfono", 500.0));
        productos.put(3, new Producto(3, "Tablet", 300.0));
    }

    @Override
    public void agregarProducto(Producto producto) {
        productos.put(producto.getId(), producto);
    }

    @Override
    public void actualizarProducto(Producto producto) {
        productos.put(producto.getId(), producto);
    }

    @Override
    public void eliminarProducto(int id) {
        productos.remove(id);
    }

    @Override
    public Producto obtenerProducto(int id) {
        return productos.get(id);
    }

    @Override
    public List<Producto> listarProductos() {
        return productos.values().stream().collect(Collectors.toList());
    }
}
