package com.alex.potenza.entity.core.educationcenter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.alex.potenza.comon.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 学生信息
 * @author Alex
 *
 */
@Setter
@Getter
public class StudentInfo extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 7337406062033560604L;

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
	 * 状态  1：报名  2：入学   3：毕业  4：肄业
	 */
	private Integer stutas = 1;
	
	/**
	 * 所属学院
	 */
	private String academyCode;
	
	/**
	 * 教学安排
	 */
	private List<TeachingSchedule> teachingSchedules;
	

}
