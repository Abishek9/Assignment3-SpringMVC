package com.capgemini.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springmvc.dao.EmployeeDao;
import com.capgemini.springmvc.dao.EmployeeDaoImplementation;
import com.capgemini.sprinmvc.bean.EmployeePrimaryInfo;
@Service
public class EmployeeServiceImplements implements EmployeeService{

	@Autowired
	private EmployeeDao dao ;
	@Override
	public EmployeePrimaryInfo auth(int id, String password) {
		return dao.auth(id, password);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeePrimaryInfo emp) {
		return dao.updateEmployeeInfo(emp);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		return dao.deleteEmployeeInfo(id);
	}

	@Override
	public boolean createEmployeeInfo(EmployeePrimaryInfo emp) {
		return dao.createEmployeeInfo(emp);
	}

	@Override
	public List<EmployeePrimaryInfo> getAllEmployeeInfo() {
		return dao.getAllEmployeeInfo();
	}

	@Override
	public EmployeePrimaryInfo getEmployeeInfo(int id) {
		return dao.getEmployeeInfo(id);
	}

}
