package com.alex.potenza.entity.core.sys;

import java.io.Serializable;

import com.alex.potenza.comon.BaseEntity;

import lombok.Getter;
import lombok.Setter;


/**
 * 专业实体
 * @author Alex
 *
 */
@Setter
@Getter
public class Major extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 8881966071380737554L;
	
	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 介绍
	 */
	private String des;
	
	/**
	 * 是否启用  1：启用  2：未启用  默认1
	 */
	private Integer enabled = 1;
	
	/**
	 * 所属学院
	 */
	private String academyCode;
	
	private Academy academy;

}
