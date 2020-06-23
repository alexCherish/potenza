package com.alex.potenza.lms.syscenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 教室控制器
 * @author Alex
 *
 */
@Controller
@RequestMapping("syscenter/classroom")
public class ClassroomController {

	@RequestMapping("index")
	public String index() {
		return "syscenter/classroom/index";
	}
}
