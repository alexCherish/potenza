package com.alex.potenza.entity.core.sys;

import java.io.Serializable;

import com.alex.potenza.comon.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 行业分类	 
 * @author Alex
 *
 */
@Setter
@Getter
public class IndustryClassify extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 4733288560176361209L;

	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 简介
	 */
	private String des;
	
	/**
	 * 是否启用
	 */
	private Integer enabled;
	
	/**
	 * 上级行业类型
	 */
	private String pcode;
	
}
