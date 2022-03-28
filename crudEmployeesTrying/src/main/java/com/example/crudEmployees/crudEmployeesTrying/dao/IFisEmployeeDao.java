package com.example.crudEmployees.crudEmployeesTrying.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudEmployees.crudEmployeesTrying.model.FisEmployee;


@Repository
@Transactional
public interface IFisEmployeeDao extends JpaRepository <FisEmployee,Integer>{
	

}
