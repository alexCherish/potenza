package com.alex.potenza.comon;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * 基础实体
 * @author Alex
 *
 */
@Setter
@Getter
public class BaseEntity {

	/**
	 * 主键：自增
	 */
	private Integer id;
	
	/**
	 * 业务编码
	 */
	private String code;
	
	/**
	 * 逻辑删除  1：删除  2：未删除，默认未删除
	 */
	private Integer deleted;
	
	/**
	 * 入库 创建 时间  
	 */
	private Date createTime;
	
	/**
	 * 入库 更新 时间
	 */
	private Date updateTime;

}
