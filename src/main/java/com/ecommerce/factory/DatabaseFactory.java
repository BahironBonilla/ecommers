// DatabaseFactory.java
package com.ecommerce.factory;

import com.ecommerce.dao.ProductoDAO;

public abstract class DatabaseFactory {
    public abstract ProductoDAO crearProductoDAO();
}
