package com.spring.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.spring.model.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Long> {

}
