package com.alex.potenza.lms.syscenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 专业控制器
 * @author Alex
 *
 */
@Controller
@RequestMapping("syscenter/major")
public class MajorController {

	@RequestMapping("index")
	public String index() {
		return "syscenter/major/index";
	}
}
