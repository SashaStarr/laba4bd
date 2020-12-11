package com.starytskyy.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import com.starytskyy.ConnectorSql;
import com.starytskyy.service.AbstractService;

@SuppressWarnings({ "deprecation", "rawtypes", "unchecked" })
public abstract class AbstractController<T, ID, SERVICE> implements ControllerTemplate<T, ID> {

    AbstractService service;

    public AbstractController(Class<SERVICE> currentClass) {
        try {
            service = (AbstractService) currentClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<T> getAll() throws SQLException {
        Connection connection = ConnectorSql.getConnection();
        List<T> entities = service.getAll();
        connection.close();
        return entities;
    }

    @Override
    public T getBy(ID id) throws SQLException {
        Connection connection = ConnectorSql.getConnection();
        T entity = (T) service.getBy(id);
        connection.close();
        return entity;
    }

    @Override
    public int delete(ID id) throws SQLException {
        Connection connection = ConnectorSql.getConnection();
        int result = service.delete(id);
        connection.close();
        return result;
    }

    @Override
    public int update(T entity) throws SQLException {
        Connection connection = ConnectorSql.getConnection();
        int result = service.update(entity);
        connection.close();
        return result;
    }

    @Override
    public int create(T entity) throws SQLException {
        Connection connection = ConnectorSql.getConnection();
        int result = service.create(entity);
        connection.close();
        return result;
    }

}