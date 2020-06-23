package com.alex.potenza.entity.core.sys;

import java.io.Serializable;
import java.util.List;

import com.alex.potenza.comon.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 学院实体
 * @author Alex
 *
 */
@Setter
@Getter
public class Academy extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = -6859942607702106181L;
	
	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 描述
	 */
	private String des;
	
	/**
	 * 是否启用 1：启用  2：未启用   默认：启用
	 */
	private Integer enabled = 1;
	
	/**
	 * 相关专业
	 */
	private String majorCode;
	
	
	
	private List<Department> departments;
	
	private List<Employee> employees;
	
	private Major major;
	
	private List<Position> positions;
	
	private List<Classroom> classrooms;
}
