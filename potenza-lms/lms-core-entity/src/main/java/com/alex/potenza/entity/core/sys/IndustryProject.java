package com.alex.potenza.entity.core.sys;

import java.io.Serializable;

import com.alex.potenza.comon.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 行业
 * @author Alex
 *
 */
@Setter
@Getter
public class IndustryProject  extends BaseEntity implements Serializable{

	private static final long serialVersionUID = -5167000779429775173L;

	/**
	 * 名字
	 */
	private String name;
	
	/**
	 * 简介
	 */
	private String des;
	
	/**
	 * 是否启用  1：启用  2：未启用
	 */
	private Integer enabled;
	
	/**
	 * 行业类型
	 */
	private String industryClassifyCode;
	
	
}
