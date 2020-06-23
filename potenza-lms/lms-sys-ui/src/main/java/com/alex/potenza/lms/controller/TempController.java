package com.alex.potenza.lms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 模板界面
 * @author Alex
 *
 */
@Controller
public class TempController {
	
	/**
	 * themleaf基础布局公共界面模板
	 * @param model
	 * @return
	 */
	@RequestMapping("/")
	public String home(Model model) {
		return "redirect:temp/base";
	}
	
	/**
	 * themleaf基础布局公共界面模板
	 * @param model
	 * @return
	 */
	@RequestMapping("temp/base")
	public String base(Model model) {
		return "temp/base";
	}

	/**
	 * 一般列表页模板
	 * @param model
	 * @return
	 */
	@RequestMapping("temp/index")
	public String index(Model model) {
		return "temp/index";
	}
	

	/**
	 * 一般列表页模板
	 * @param model
	 * @return
	 */
	@RequestMapping("temp/indexele")
	public String indexEle(Model model) {
		return "temp/index_ele";
	}
	
	/**
	 * 大表单页布局模板
	 * @param model
	 * @return
	 */
	@RequestMapping("temp/bigform")
	public String bigForm(Model model) {
		return "temp/bigForm";
	}
	/**
	 * 大表单分组式页布局模板
	 * @param model
	 * @return
	 */
	@RequestMapping("temp/biggroupform")
	public String bigGroupForm(Model model) {
		return "temp/bigGroupForm";
	}
	
	/**
	 * 详情页面模板
	 * @param model
	 * @return
	 */
	@RequestMapping("temp/detail")
	public String detail(Model model) {
		return "temp/detail";
	}
	
	/**
	 * 弹出框模版
	 * @param model
	 * @return
	 */
	@RequestMapping("temp/modal")
	public String modal(Model model) {
		return "temp/modal";
	}
	
	
	
	
	
	
	
	
}
