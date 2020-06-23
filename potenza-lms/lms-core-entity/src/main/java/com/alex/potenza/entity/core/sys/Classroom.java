package com.alex.potenza.entity.core.sys;

import java.io.Serializable;

import com.alex.potenza.comon.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 教室实体
 * @author Alex
 *
 */
@Setter
@Getter
public class Classroom extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 2202664020087080443L;

	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 教室号
	 */
	private String no;
	
	/**
	 * 地址
	 */
	private String address;
	
	/**
	 * 描述
	 */
	private String des;
	
	/**
	 * 是否启用 1:启用  2：未启用   默认：启用
	 */
	private Integer enabled = 1;
	
	private String academyCode;
	
	private Academy academy;
	
}
