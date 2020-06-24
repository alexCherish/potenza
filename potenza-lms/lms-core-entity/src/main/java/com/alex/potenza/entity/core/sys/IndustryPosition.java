package com.alex.potenza.entity.core.sys;

import java.io.Serializable;

import com.alex.potenza.comon.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 职位
 * @author Alex
 *
 */
@Setter
@Getter
public class IndustryPosition extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 5467595421325850670L;

	private String name;
	
	private String des;
	
	private Integer enabled;
	
	/**
	 * 所属行业
	 */
	private String IndustryClassifyCode;
	
}
