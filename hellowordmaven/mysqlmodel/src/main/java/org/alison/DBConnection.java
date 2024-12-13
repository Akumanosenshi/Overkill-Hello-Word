package org.alison;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum DBConnection {
    INSTANCE();

    private Connection connection;

    DBConnection() {
        this.connection = null;
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void connect() throws IOException, ClassNotFoundException, SQLException {
        final DBProperties dbProperties = new DBProperties();
        dbProperties.load();
        Class.forName(dbProperties.getDriver());
        this.connection = DriverManager.getConnection(dbProperties.getUrl(),
                dbProperties.getUser(),
                dbProperties.getPassword());
        System.out.println("Connected to database");
    }

    public void disconnect() {
        System.out.println("Disconnected from database");
    }
}
