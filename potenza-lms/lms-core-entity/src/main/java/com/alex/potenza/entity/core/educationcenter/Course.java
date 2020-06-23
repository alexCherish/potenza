package com.alex.potenza.entity.core.educationcenter;

import java.io.Serializable;
import java.util.List;

import com.alex.potenza.comon.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 课程管理
 * @author Alex
 *
 */
@Setter
@Getter
public class Course extends BaseEntity implements Serializable{

	private static final long serialVersionUID = -9065268983831825793L;
	
	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 描述
	 */
	private String des;
	
	/**
	 * 是否启用  1：启用  2：未启用   
	 * 默认启用
	 */
	private Integer enabled = 1;
	
	/**
	 * 教学安排
	 */
	private List<TeachingSchedule> teachingSchedules;
	
	
}
