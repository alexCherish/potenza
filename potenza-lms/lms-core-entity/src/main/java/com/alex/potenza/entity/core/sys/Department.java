package com.alex.potenza.entity.core.sys;

import java.io.Serializable;
import java.util.List;

import com.alex.potenza.comon.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 部门实体
 * @author Alex
 *
 */
@Setter
@Getter
public class Department extends BaseEntity implements Serializable{

	private static final long serialVersionUID = -6393976008746444595L;

	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 备注描述
	 */
	private String des;
	
	/**
	 * 是否启用  1：启用  2：未启用  默认：启用
	 */
	private Integer enabled = 1;
	
	/**
	 * 所属学院
	 */
	private String academyCode;
	
	/**
	 * 上级部门编码
	 */
	private String pCode;
	
	
	private Academy academy;
	
	private List<Employee> employees;
	
	private List<Position> positions;
	
	/**
	 * 上级部门
	 */
	private Department pDepartment;
	
}
