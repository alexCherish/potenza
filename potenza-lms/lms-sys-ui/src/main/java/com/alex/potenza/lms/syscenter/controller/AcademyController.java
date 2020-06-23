package com.alex.potenza.lms.syscenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 学院管理
 * @author Alex
 *
 */
@Controller
@RequestMapping("syscenter/academy")
public class AcademyController {
	
	@RequestMapping("index")
	public String index() {
		return "syscenter/academy/index";
	}

}
