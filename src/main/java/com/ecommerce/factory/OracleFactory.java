// OracleFactory.java
package com.ecommerce.factory;

import com.ecommerce.dao.OracleProductoDAO;
import com.ecommerce.dao.ProductoDAO;

public class OracleFactory extends DatabaseFactory {
    @Override
    public ProductoDAO crearProductoDAO() {
        return new OracleProductoDAO();
    }
}
