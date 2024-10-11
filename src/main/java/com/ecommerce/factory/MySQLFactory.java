// MySQLFactory.java
package com.ecommerce.factory;

import com.ecommerce.dao.MySQLProductoDAO;
import com.ecommerce.dao.ProductoDAO;

public class MySQLFactory extends DatabaseFactory {
    @Override
    public ProductoDAO crearProductoDAO() {
        return new MySQLProductoDAO();
    }
}
