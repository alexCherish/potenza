package com.alex.potenza.entity.core.educationcenter;

import java.io.Serializable;
import java.util.List;

import com.alex.potenza.comon.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 班级实体
 * @author Alex
 *
 */
@Setter
@Getter
public class GradeClass extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 6568086639620971905L;

	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 描述
	 */
	private String des;
	
	/**
	 * 教学安排
	 */
	private List<TeachingSchedule> teachingSchedules;
	
	
}
