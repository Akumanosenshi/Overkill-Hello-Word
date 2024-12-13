package org.alison;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class DBProperties extends Properties {
    private static final String PROPERTIES_FILE_NAME = "db.properties";
    private String url;
    private String user;
    private String password;
    private String driver;

    public void load() throws IOException {
        final String path = Objects.requireNonNull(
                this.getClass().getClassLoader().getResource(DBProperties.PROPERTIES_FILE_NAME)).getPath();
        final FileInputStream inputStream = new FileInputStream(path);
        this.load(inputStream);
        this.url = this.getProperty("url");
        this.user = this.getProperty("user");
        this.password = this.getProperty("password");
        this.driver = this.getProperty("driver");
    }

    public String getUrl() {
        return this.url;
    }

    public String getUser() {
        return this.user;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDriver() {
        return this.driver;
    }
}
