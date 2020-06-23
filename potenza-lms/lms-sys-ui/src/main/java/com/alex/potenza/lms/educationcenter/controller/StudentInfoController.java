package com.alex.potenza.lms.educationcenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 学籍信息管理控制器
 * @author Alex
 *
 */
@Controller
@RequestMapping("educationcenter/student")
public class StudentInfoController {

	@RequestMapping("index")
	public String home() {
		return "educationCenter/student/index";
	}
	
	
	
}
