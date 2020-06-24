package com.alex.potenza.entity.core.employmentcenter;

import java.io.Serializable;
import java.util.Date;

import com.alex.potenza.comon.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 就业信息
 * @author Alex
 *
 */
@Setter
@Getter
public class EmploymentInfo extends BaseEntity implements Serializable{

	private static final long serialVersionUID = -9144538774534012906L;

	/**
	 * 公司名
	 */
	private String componyName;
	
	/**
	 * 公司地址 
	 */
	private String componyAddress;
	
	/**
	 * 入职日期
	 */
	private Date onDate;
	
	/**
	 * 试用期薪资
	 */
	private Float probationSalary;
	
	/**
	 * 转正薪资
	 */
	private Float salary;
	
	/**
	 * 试用期：按月
	 */
	private Integer probation;
	
	/**
	 * 是否渠道安置 1：渠道  2：非渠道
	 */
	private Integer isChannel;
	
	/**
	 * 职位类型
	 */
	private String positionTypeCode;
	
	/**
	 * 职位
	 */
	private String positionCode;
	
	/**
	 * 是否应届
	 */
	private Integer isCurrent;
	
	/**
	 * 公司
	 */
	private String componyCode;
	
	/**
	 * 公司联系人姓名
	 */
	private String componyContactName;
	
	/**
	 * 公司联系人电话
	 */
	private String componyContactNo;
	
	/**
	 * 学生
	 */
	private String studentInfoCode;
	
}
