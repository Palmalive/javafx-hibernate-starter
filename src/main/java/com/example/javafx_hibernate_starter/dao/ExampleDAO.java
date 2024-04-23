package com.example.javafx_hibernate_starter.dao;

import com.example.javafx_hibernate_starter.entity.Example;
import com.example.javafx_hibernate_starter.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ExampleDAO {
    public List<Example> findAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Example", Example.class).getResultList();
        }
    }

    public void addPlaceholder() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(new Example("text"));
            transaction.commit();
        }
    }

}
