package com.ghanmi.genericrestapi.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ghanmi.genericrestapi.model.BaseModel;

public interface BaseDao<T extends BaseModel> extends JpaRepository<T, Serializable> {

}
