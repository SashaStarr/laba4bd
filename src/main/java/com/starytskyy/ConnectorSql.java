package com.starytskyy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorSql {

    private static final String url = "jdbc:mysql://localhost:3306/laba3bd?useUnicode"
            + "=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";

    private static final String username = "root";

    private static final String password = "qweasdcxzQ1";

    private static Connection connection = null;

    private ConnectorSql() {
    }

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                try {
                    connection = DriverManager.getConnection(url, username, password);
                } catch (SQLException exeption) {
                    printExeption(exeption);
                }
            }
        } catch (SQLException exeption) {
            printExeption(exeption);
        }
        return connection;
    }

    private static void printExeption(SQLException exeption) {
        System.out.println("SQL Exeption: " + exeption.getMessage());
        System.out.println("SQL State: " + exeption.getSQLState());
        System.out.println("SQL Error Code: " + exeption.getErrorCode());
    }
}

