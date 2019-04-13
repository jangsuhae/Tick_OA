package com.qianfeng.controller;

import com.qianfeng.common.JsonBean;
import com.qianfeng.entity.Employee;
import com.qianfeng.service.EmployeeService;
import com.qianfeng.utils.JsonUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@RequestMapping("/add.do")
	public JsonBean addEmp(Employee emp){
		
		try{
			empService.addEmployee(emp);
			return JsonUtils.createJsonBean(1, null);
		}catch(Exception e){
			return JsonUtils.createJsonBean(0, e.getMessage());
		}
		
	}

	@RequestMapping("/list.do")
	public JsonBean listEmp(){
		List<Employee> list = empService.findAllEemployee();
		return JsonUtils.createJsonBean(1, list);
	}
	@RequiresPermissions("sys.delete")
	@RequestMapping("/delete.do")
	public JsonBean deleteEmp(int id){
		empService.deleteEmpById(id);
		return JsonUtils.createJsonBean(1, null);
	}
	
	@RequestMapping("/query.do")
	public JsonBean queryById(int id){
		Employee emp = empService.findEmpById(id);
		
		return JsonUtils.createJsonBean(1, emp);
		
	}
	
	@RequestMapping("/update.do")
	public JsonBean updateEmp(Employee emp){
		empService.updateEmp(emp);
		
		return JsonUtils.createJsonBean(1, null);
	}
	
}
