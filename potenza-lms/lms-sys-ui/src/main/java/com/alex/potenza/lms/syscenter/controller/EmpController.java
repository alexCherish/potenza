package com.alex.potenza.lms.syscenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 员工管理模块控制器
 * @author Alex
 *
 */
@Controller
@RequestMapping("syscenter/emp")
public class EmpController {
	
	@RequestMapping("index")
	public String index() {
		return "syscenter/emp/index";
	}

}
