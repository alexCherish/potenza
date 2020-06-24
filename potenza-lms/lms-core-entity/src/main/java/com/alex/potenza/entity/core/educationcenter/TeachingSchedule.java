package com.alex.potenza.entity.core.educationcenter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.alex.potenza.comon.BaseEntity;
import com.alex.potenza.entity.core.sys.Classroom;
import com.alex.potenza.entity.core.sys.Employee;

import lombok.Getter;
import lombok.Setter;

/**
 * 教学安排实体
 * @author Alex
 *
 */
@Setter
@Getter
public class TeachingSchedule extends BaseEntity implements Serializable{

	private static final long serialVersionUID = -262577038076288067L;

	/**
	 * 是否必修  
	 * 1：必修   2：非必修      默认必修
	 */
	private Integer required = 1;
	
	/**
	 * 课程
	 */
	private String courseCode;
	
	/**
	 * 班级
	 */
	private String gradeClassCode;
	
	/**
	 * 教学安排开始时间
	 */
	private Date startTime;
	
	/**
	 * 教学安排节课时间
	 */
	private Date endTime;
	
	/**
	 * 教学方式：1：线下授课   2：线上授课    3：混合授课
	 * 默认 线下授课
	 */
	private Integer teachingType = 1;
	
	/**
	 * 教学目标，描述本教学周期的目标
	 */
	private String teachingTarget;
	
	/**
	 * 描述备注
	 */
	private String des;
	
	/**
	 * 状态：1：草稿  2：审核中   3：审核成功   4：审核失败  5：未开始  6：进行中 7：已结束
	 */
	private Integer stutas;
	
	
	/**
	 * 教室号
	 */
	private String classroomCode;
	
	
	/**
	 * 教室
	 */
	private Classroom classroom;
	
	/**
	 * 学生
	 */
	private List<StudentInfo> studentInfos;

	/**
	 * 教师
	 */
	private List<Employee> teachers;
	
	/**
	 * 相关课程
	 */
	private Course course;
	
	
	/**
	 * 班级
	 */
	private GradeClass gradeClass;
	
	
}
