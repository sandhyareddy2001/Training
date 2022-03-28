package com.example.crudEmployees.crudEmployeesTrying.service;

import java.util.List;
import java.util.Optional;

import com.example.crudEmployees.crudEmployeesTrying.model.FisEmployee;

public interface iFisEmployeeService {
	public List<FisEmployee> getAll();
	public Optional<FisEmployee> searchById(Integer empid);
	public String deleteEmployee(FisEmployee employee);
	public FisEmployee insertEmployee(FisEmployee employee);


}
