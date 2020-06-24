package com.alex.potenza.entity.core.sys;

import java.io.Serializable;

import com.alex.potenza.comon.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 技能
 * @author Alex
 *
 */
@Setter
@Getter
public class IndustrySkill extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 582006800187722626L;

	private String name;
	
	private String des;
	
	private Integer enabled;
	
	/**
	 * 技能分类
	 */
	private String skillClassifyCode;
	
	/**
	 * 所属职位
	 */
	private String positionCode;
}
