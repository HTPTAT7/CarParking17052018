package by.htp.carparking.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import by.htp.carparking.domain.BaseEntity;


public interface BaseDao<T extends BaseEntity> {
	
	void create(T entity);

	T read(int id);

	List<T> readAll();

	void update(T entity);

	void delete(int id);

}
