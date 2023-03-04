package com.emlakburada.repository;

import com.emlakburada.entity.User;

import java.sql.SQLException;

public interface UserRepository {
	void save(User user) throws SQLException;
	void findAll() throws SQLException;
	void findOne(Integer id) throws SQLException;
	void update(Integer id) throws SQLException;
	void delete(Integer id) throws SQLException;
}