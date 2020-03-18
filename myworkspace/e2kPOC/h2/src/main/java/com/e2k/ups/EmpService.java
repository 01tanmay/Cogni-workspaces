package com.e2k.ups;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

	@Autowired
	EmpRepo repository;

	public List<Employee> getAllEmployees() {
		List<Employee> emps = new ArrayList<Employee>();
		repository.findAll().forEach(emp -> emps.add(emp));
		return emps;
	}

	public Employee getEmployeeById(int id) {
		return repository.findById(id).get();
	}

	public void saveOrUpdate(Employee emp) {
		repository.save(emp);
	}

	public void delete(int id) {
		repository.deleteById(id);
	}
}
