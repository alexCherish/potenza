package com.alex.potenza.lms.educationcenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 班级管理控制器
 * @author Alex
 *
 */
@Controller
@RequestMapping("educationcenter/gradeclass")
public class GradeClassController {
	
	@RequestMapping("index")
	public String index() {
		return "educationCenter/gradeclass/index";
	}

}
