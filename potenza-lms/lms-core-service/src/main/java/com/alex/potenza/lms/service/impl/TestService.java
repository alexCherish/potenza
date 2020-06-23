package com.alex.potenza.lms.service.impl;


import org.apache.dubbo.config.annotation.DubboService;

import com.alex.potenza.lms.service.ITestService;

@DubboService
public class TestService  implements ITestService{
	
	public String test() {
		return "hello";
	}

}
