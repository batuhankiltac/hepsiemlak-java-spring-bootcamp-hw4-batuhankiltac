package com.emlakburada.repository;

import com.emlakburada.entity.Advert;

import java.sql.SQLException;

public interface AdvertRepository {
    void save(Advert advert) throws SQLException;
    void findAll() throws SQLException;
    void findOne(Integer id) throws SQLException;
    void update(Integer id) throws SQLException;
    void delete(Integer id) throws SQLException;
}