package com.coderby.myapp.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coderby.myapp.hr.model.EmpVO;
import com.coderby.myapp.hr.service.IEmpService;

@Controller
@RequestMapping("/hr")
public class EmpController {
	
	@Autowired
	IEmpService empService;
	
	@RequestMapping(value="/insert", method=RequestMethod.GET)
	public String insert() {
		return "emp/insertform";
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
		public String insert(EmpVO emp) {
		empService.insertEmp(emp);
		return "redirect:/hr";
	}
	
}
