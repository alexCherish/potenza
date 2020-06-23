package com.alex.potenza.entity.core.sys;

import java.io.Serializable;
import java.util.Date;

import com.alex.potenza.comon.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 员工实体
 * @author Alex
 *
 */
@Setter
@Getter
public class Employee extends BaseEntity implements Serializable{

	private static final long serialVersionUID = -6300756498023235396L;

	/**
	 * 名字
	 */
	private String name;
	
	/**
	 * 出生日期
	 */
	private Date bornDay;
	
	/**
	 * 性别  1：男  2：女  3：其他
	 */
	private Integer sex;
	
	/**
	 * 证件类型
	 */
	private Integer idType;
	
	/**
	 * 证件号码 1：身份证  
	 */
	private String idNo;
	
	/**
	 * 手机号
	 */
	private String mobileNo;
	
	/**
	 * 邮箱
	 */
	private String email;
	
	/**
	 * 国家
	 */
	private String nationality;
	
	/**
	 * 籍贯
	 */
	private String nativePlace;
	
	/**
	 * 婚姻状况
	 */
	private Integer maritalStatus;
	
	/**
	 * 政治面貌
	 */
	private Integer politicsStatus; 
	
	/**
	 * 是否是独生子女  1：是  2：不是 
	 */
	private Integer oneChildFamily;
	
	/**
	 * 当前详细住址
	 */
	private String addressDetail;
	
	/**
	 * 是否离职   1：离职  2：未离职  默认：未离职
	 */
	private Integer off = 2;
	
	/**
	 * 所属学院
	 */
	private String academyCode;
	
	/**
	 * 所属部门
	 */
	private String departmentCode;
	
	/**
	 * 职位
	 */
	private String positionCode;
	
	
	
	private Academy academy;
	
	private Department department;
	
	private Position position;
	
}
