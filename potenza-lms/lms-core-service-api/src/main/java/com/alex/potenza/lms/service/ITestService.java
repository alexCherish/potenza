package com.alex.potenza.lms.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * 测试服务
 * @author Alex
 *
 */
@Path("test")
public interface ITestService {
	
	@GET
	@Path("test")
	public String test();
	
}
