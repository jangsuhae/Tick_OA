package com.qianfeng.service;

import java.util.List;

import com.qianfeng.entity.Employee;

// 业务层的方法名体现的是功能
public interface EmployeeService {

	public void addEmployee(Employee emp);
	
	public List<Employee> findAllEemployee();
	
	public void deleteEmpById(Integer id);
	
	public Employee findEmpById(Integer id);
	
	public void updateEmp(Employee emp);
}
