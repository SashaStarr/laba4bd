package com.starytskyy.service;

import java.sql.SQLException;
import java.util.List;
import com.starytskyy.DAO.DAOTemplate;

public abstract class AbstractService<T, ID, DAO> implements ServiceTemplate<T, ID> {

    private DAOTemplate<T, ID> dataaccess;

    @SuppressWarnings({ "unchecked", "deprecation" })
    public AbstractService(Class<DAO> currentClass) {
        try {
            dataaccess = (DAOTemplate<T, ID>) currentClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<T> getAll() throws SQLException {
        return dataaccess.getAll();
    }

    @Override
    public T getBy(ID id) throws SQLException {
        return dataaccess.getBy(id);
    }

    @Override
    public int delete(ID id) throws SQLException {
        return dataaccess.delete(id);
    }

    @Override
    public int update(T entity) throws SQLException {
        return dataaccess.update(entity);
    }

    @Override
    public int create(T entity) throws SQLException {
        return dataaccess.create(entity);
    }

}