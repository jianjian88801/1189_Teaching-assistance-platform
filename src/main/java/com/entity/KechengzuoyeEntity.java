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
 * 课程作业
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-12 10:14:49
 */
@TableName("kechengzuoye")
public class KechengzuoyeEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KechengzuoyeEntity() {
		
	}
	
	public KechengzuoyeEntity(T t) {
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
	 * 作业名称
	 */
					
	private String zuoyemingcheng;
	
	/**
	 * 作业内容
	 */
					
	private String zuoyeneirong;
	
	/**
	 * 作业文件
	 */
					
	private String zuoyewenjian;
	
	/**
	 * 作业详情
	 */
					
	private String zuoyexiangqing;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 课程图片
	 */
					
	private String kechengtupian;
	
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
	 * 设置：作业内容
	 */
	public void setZuoyeneirong(String zuoyeneirong) {
		this.zuoyeneirong = zuoyeneirong;
	}
	/**
	 * 获取：作业内容
	 */
	public String getZuoyeneirong() {
		return zuoyeneirong;
	}
	/**
	 * 设置：作业文件
	 */
	public void setZuoyewenjian(String zuoyewenjian) {
		this.zuoyewenjian = zuoyewenjian;
	}
	/**
	 * 获取：作业文件
	 */
	public String getZuoyewenjian() {
		return zuoyewenjian;
	}
	/**
	 * 设置：作业详情
	 */
	public void setZuoyexiangqing(String zuoyexiangqing) {
		this.zuoyexiangqing = zuoyexiangqing;
	}
	/**
	 * 获取：作业详情
	 */
	public String getZuoyexiangqing() {
		return zuoyexiangqing;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
	/**
	 * 设置：课程图片
	 */
	public void setKechengtupian(String kechengtupian) {
		this.kechengtupian = kechengtupian;
	}
	/**
	 * 获取：课程图片
	 */
	public String getKechengtupian() {
		return kechengtupian;
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
