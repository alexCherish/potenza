package com.alex.potenza.entity.core.sys;

import java.io.Serializable;

import com.alex.potenza.comon.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 技能分类
 * @author Alex
 *
 */
@Setter
@Getter
public class IndustrySkillClassify extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 2785814870457515611L;
	
	private String name;
	
	private String des;
	
	private Integer enabled;
	
	/**
	 * 上级技能类型
	 */
	private String pcode;

}
