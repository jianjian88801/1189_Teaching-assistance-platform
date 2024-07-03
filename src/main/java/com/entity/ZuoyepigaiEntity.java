package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 作业批改
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-12 10:14:49
 */
@TableName("zuoyepigai")
public class ZuoyepigaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZuoyepigaiEntity() {
		
	}
	
	public ZuoyepigaiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 课程名称
	 */
					
	private String kechengmingcheng;
	
	/**
	 * 科目
	 */
					
	private String kemu;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 作业名称
	 */
					
	private String zuoyemingcheng;
	
	/**
	 * 作业评分
	 */
					
	private Integer zuoyepingfen;
	
	/**
	 * 批改文件
	 */
					
	private String pigaiwenjian;
	
	/**
	 * 教师评语
	 */
					
	private String jiaoshipingyu;
	
	/**
	 * 批改日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date pigairiqi;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：课程名称
	 */
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
	}
	/**
	 * 设置：科目
	 */
	public void setKemu(String kemu) {
		this.kemu = kemu;
	}
	/**
	 * 获取：科目
	 */
	public String getKemu() {
		return kemu;
	}
	/**
	 * 设置：班级
	 */
	public void setBanji(String banji) {
		this.banji = banji;
	}
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：作业名称
	 */
	public void setZuoyemingcheng(String zuoyemingcheng) {
		this.zuoyemingcheng = zuoyemingcheng;
	}
	/**
	 * 获取：作业名称
	 */
	public String getZuoyemingcheng() {
		return zuoyemingcheng;
	}
	/**
	 * 设置：作业评分
	 */
	public void setZuoyepingfen(Integer zuoyepingfen) {
		this.zuoyepingfen = zuoyepingfen;
	}
	/**
	 * 获取：作业评分
	 */
	public Integer getZuoyepingfen() {
		return zuoyepingfen;
	}
	/**
	 * 设置：批改文件
	 */
	public void setPigaiwenjian(String pigaiwenjian) {
		this.pigaiwenjian = pigaiwenjian;
	}
	/**
	 * 获取：批改文件
	 */
	public String getPigaiwenjian() {
		return pigaiwenjian;
	}
	/**
	 * 设置：教师评语
	 */
	public void setJiaoshipingyu(String jiaoshipingyu) {
		this.jiaoshipingyu = jiaoshipingyu;
	}
	/**
	 * 获取：教师评语
	 */
	public String getJiaoshipingyu() {
		return jiaoshipingyu;
	}
	/**
	 * 设置：批改日期
	 */
	public void setPigairiqi(Date pigairiqi) {
		this.pigairiqi = pigairiqi;
	}
	/**
	 * 获取：批改日期
	 */
	public Date getPigairiqi() {
		return pigairiqi;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}

}
