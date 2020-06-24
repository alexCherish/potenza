package com.alex.potenza.entity.core.sys;



import java.io.Serializable;
import java.util.Date;

import com.alex.potenza.comon.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 公司信息
 * @author Alex
 *
 */
@Setter
@Getter
public class Compony extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 4717423533319695890L;


	/**
	 * 公司名
	 */
	private String name;

	
	/**
	 * 公司地址
	 */
	private String address;
	
	/**
	 * 官网
	 */
	private String url;
	
	/**
	 * 邮箱
	 */
	private String email;
	
	/**
	 * 成立时间
	 */
	private Date createTime;
	
	/**
	 * 简介
	 */
	private String des;
	
	/**
	 * 企业类型  1：国有企业   2：集体所有制  3：股份制  4：联营企业  5：个人独资
	 */
	private Integer type; 
	
	/**
	 * 是否上市  1：上市  2：未上市
	 */
	private Integer IPO;
	
	/**
	 * 公司规模下限
	 */
	private Integer scaleLower;
	
	/**
	 * 公司规模下限
	 */
	private Integer scaleHigher;
	
	
}

