package com.capgemini.springmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import com.capgemini.springmvc.service.EmployeeService;
import com.capgemini.sprinmvc.bean.EmployeePrimaryInfo;
@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-mm-dd"),true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}
	@GetMapping("/add")
	public String getForm() {
		return "addEmployee";
	}

	@PostMapping("/added")
	public String submitForm(EmployeePrimaryInfo emp,ModelMap map) {

		boolean added = service.createEmployeeInfo(emp);

		if(added) {
			return "main-menu";
		}else {
			return "addEmployee";
		}	
	}// End of submit form

	@GetMapping("/search")
	public String getSearchForm() {
		return "searchEmp";
	}

	@GetMapping("/searchEmployee")
	public String getDetail(int id , ModelMap map) {
		EmployeePrimaryInfo bean = service.getEmployeeInfo(id);

		if(bean!=null) {
			map.addAttribute("bean",bean);
			return "searched";
		}else {
			return "searchEmp";
		}

	}

	@GetMapping("/delete")
	public String getDeleteForm() {
		return "deleteEmp";
	}

	@GetMapping("/deleteEmployee")
	public String deleted(int id,ModelMap map) {
		boolean bean = service.deleteEmployeeInfo(id);
		if(bean) {
			map.addAttribute("hello", "Record Deleted");
			return "hello";
		}else {
			return "deleteEmp";
		}

	} 
	@GetMapping("/getAll")
	public String getGetAll() {
		return "allDetail";
	}
	
	@GetMapping("/getAllEmployee")
	public String getAllEmployee(ModelMap map) {
		List<EmployeePrimaryInfo> allRecord = service.getAllEmployeeInfo();
		map.addAttribute("list", allRecord);
		return "getAllEmployee";
	}
	
	@GetMapping("/update")
	public String getUpdate() {
		return "updateEmp";
	}
	
	@GetMapping("/updateEmployee")
	public String updated(EmployeePrimaryInfo emp,ModelMap map) {
		boolean bean = service.updateEmployeeInfo(emp);
		if(bean) {
			map.addAttribute("hello", "Record Updated");
			return "hello";
		}else {
			return "updateEmp";
		}
	}
	
	@GetMapping("/loginEmp")
	public String getLogin() {
		return "login";
	}
	
	@GetMapping("/loginEmployee")
	public String login(int id, String password,ModelMap map) {
		EmployeePrimaryInfo info = service.auth(id, password);
		if(info.getId()==id && info.getPassword().equals(password)) {
			map.addAttribute("bean", info);
			return "main-menu";
		}else {
			return "login";
		}
	}
	

	
	
	
	


}//End of class
