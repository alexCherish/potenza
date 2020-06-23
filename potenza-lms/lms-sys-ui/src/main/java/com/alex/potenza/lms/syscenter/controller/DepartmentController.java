package com.alex.potenza.lms.syscenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 部门控制器
 * @author Alex
 *
 */
@Controller
@RequestMapping("syscenter/department")
public class DepartmentController {

	@RequestMapping("index")
	public String index() {
		return "syscenter/department/index";
	}
}
