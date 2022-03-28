package com.example.crudEmployees.crudEmployeesTrying.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudEmployees.crudEmployeesTrying.model.FisEmployee;
import com.example.crudEmployees.crudEmployeesTrying.service.FisEmployeeSeviceImpl;

@RequestMapping("/c")
@RestController
public class MainController {

	@Autowired
	FisEmployeeSeviceImpl serv;
	
	
	@GetMapping("/hi")
	public String hi() {
		return "Hiii";
	}
	
	@GetMapping("/all")
	public List<FisEmployee> showAllEmps(){
		return serv.getAll();
	}
	
	@PostMapping("/add")
	public FisEmployee insertEmp(@RequestBody FisEmployee employee) {
		return serv.insertEmployee(employee);
	}
	
	@DeleteMapping("/delete")
	public String deleteEmp(@RequestBody FisEmployee employee) {
		return serv.deleteEmployee(employee);
	}
	
	@GetMapping("/search/{empid}")
	public Optional<FisEmployee> searchByEmpid(@PathVariable("empid") Integer empid){
		
		return serv.searchById(empid);
	}

	

}
