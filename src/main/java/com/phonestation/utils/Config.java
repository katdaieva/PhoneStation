package com.phonestation.utils;

import lombok.Getter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Getter
public class Config {
    private String url;
    private String username;
    private String password;
    private String factoryClassName;

    public Config() {
        load();
    }

    private static class Holder {
        private static Config INSTANCE = new Config();
    }

    public static Config getInstance() {
        return Holder.INSTANCE;
    }

    private void load() {
        try(InputStream in = this.getClass().getResourceAsStream("/db.properties")) {
            Class.forName("com.mysql.jdbc.Driver");
            Properties properties = new Properties();
            properties.load(in);
            username = properties.getProperty("db.username");
            password = properties.getProperty("db.password");
            factoryClassName = properties.getProperty("db.factory.class");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
