package com.alex.potenza.lms.syscenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 职位控制器
 * @author Alex
 *
 */
@Controller
@RequestMapping("syscenter/position")
public class PositionController {

	@RequestMapping("/index")
	public String index() {
		return "syscenter/position/index";
	}
}
