package com.example.crudEmployees.crudEmployeesTrying.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudEmployees.crudEmployeesTrying.dao.IFisEmployeeDao;
import com.example.crudEmployees.crudEmployeesTrying.model.FisEmployee;

@Service
public class FisEmployeeSeviceImpl implements iFisEmployeeService {

	@Autowired
	IFisEmployeeDao dao;
	@Override
	public List<FisEmployee> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	public Optional<FisEmployee> searchById(Integer empid) {
		// TODO Auto-generated method stub
		return dao.findById(empid);
	}
	public String deleteEmployee(FisEmployee employee) {
		// TODO Auto-generated method stub
		dao.delete(employee);
		return "Deleted";
	}
	public FisEmployee insertEmployee(FisEmployee employee) {
		// TODO Auto-generated method stub
		return dao.save(employee);
	}

}
