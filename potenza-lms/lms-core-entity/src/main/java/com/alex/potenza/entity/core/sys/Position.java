package com.alex.potenza.entity.core.sys;

import java.io.Serializable;

import com.alex.potenza.comon.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 职位实体
 * @author Alex
 *
 */
@Setter
@Getter
public class Position extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 5199649487651026103L;
	
	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 备注
	 */
	private String des;
	
	/**
	 * 是否启用  1：启用  2：未启用   默认：启用
	 */
	private Integer enaled;
	
	/**
	 * 所属上级职位编码
	 */
	private String pcode;
	
	/**
	 * 所属学院
	 */
	private String academyCode;
	
	/**
	 * 所属组织机构
	 */
	private String departmentCode;
	
	/**
	 * 上级职位
	 */
	private Position pPosition;
	
	private Department department;
	
	private Academy academy;
	

}
