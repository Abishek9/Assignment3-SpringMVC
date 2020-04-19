package com.capgemini.springmvc.service;

import java.util.List;

import com.capgemini.sprinmvc.bean.EmployeePrimaryInfo;

public interface EmployeeService {
	
	public EmployeePrimaryInfo auth(int id , String password);

	public boolean updateEmployeeInfo(EmployeePrimaryInfo emp);
		
		public boolean deleteEmployeeInfo(int id);
		
		public boolean createEmployeeInfo(EmployeePrimaryInfo emp);
		
		public List<EmployeePrimaryInfo> getAllEmployeeInfo();
		
		public EmployeePrimaryInfo getEmployeeInfo(int id);

}
