// Configuracion.java
package com.ecommerce.config;

import com.ecommerce.factory.DatabaseFactory;
import com.ecommerce.factory.MySQLFactory;
import com.ecommerce.factory.OracleFactory;

public class Configuracion {
    public static DatabaseFactory configureAdapterDB(String dbType) {
        switch (dbType.toLowerCase()) {
            case "mysql":
                return new MySQLFactory();
            case "oracle":
                return new OracleFactory();
            default:
                throw new IllegalArgumentException("Tipo de base de datos no soportado");
        }
    }
}
