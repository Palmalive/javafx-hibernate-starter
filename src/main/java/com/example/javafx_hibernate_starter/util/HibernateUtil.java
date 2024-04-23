package com.example.javafx_hibernate_starter.util;

import com.example.javafx_hibernate_starter.entity.Example;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {
    private static SessionFactory sessionFactory;


    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {

                Configuration configuration = getConfiguration();
                configuration.addAnnotatedClass(Example.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;

    }

    private static Configuration getConfiguration() {
        Configuration configuration = new Configuration();

        Properties properties = new Properties();

        properties.put(Environment.JAKARTA_JDBC_DRIVER, "com.mysql.cj.jdbc.Driver");
        properties.put(Environment.JAKARTA_JDBC_URL, "jdbc:mysql://localhost:3306/database_name?createDatabaseIfNotExist=true");
        properties.put(Environment.JAKARTA_JDBC_USER, "root");
        properties.put(Environment.JAKARTA_JDBC_PASSWORD, "password");
        properties.put(Environment.SHOW_SQL, "true");
        properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        properties.put(Environment.HBM2DDL_AUTO, "update");


        configuration.setProperties(properties);
        return configuration;
    }


    public static void shutdown() {
        getSessionFactory().close();
    }
}
