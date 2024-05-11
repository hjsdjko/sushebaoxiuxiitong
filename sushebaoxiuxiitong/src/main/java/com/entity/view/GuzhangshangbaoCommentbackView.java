package com.entity.view;

import com.entity.GuzhangshangbaoCommentbackEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 故障上报评价
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("guzhangshangbao_commentback")
public class GuzhangshangbaoCommentbackView extends GuzhangshangbaoCommentbackEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 guzhangshangbao
			/**
			* 故障上报 的 学生
			*/
			private Integer guzhangshangbaoXueshengId;
			/**
			* 任务编号
			*/
			private String guzhangshangbaoUuidNumber;
			/**
			* 区域
			*/
			private Integer quyuTypes;
				/**
				* 区域的值
				*/
				private String quyuValue;
			/**
			* 所在区域
			*/
			private String guzhangshangbaoAddress;
			/**
			* 故障信息
			*/
			private String guzhangshangbaoGuzhang;
			/**
			* 故障类型
			*/
			private Integer guzhangshangbaoTypes;
				/**
				* 故障类型的值
				*/
				private String guzhangshangbaoValue;
			/**
			* 故障上报 的 维修人员
			*/
			private Integer guzhangshangbaoWeixiuyuanId;
			/**
			* 处理结果
			*/
			private Integer chulijieguoTypes;
				/**
				* 处理结果的值
				*/
				private String chulijieguoValue;

		//级联表 xuesheng
			/**
			* 学生姓名
			*/
			private String xueshengName;
			/**
			* 身份证号
			*/
			private String xueshengIdNumber;
			/**
			* 手机号
			*/
			private String xueshengPhone;
			/**
			* 照片
			*/
			private String xueshengPhoto;
			/**
			* 假删
			*/
			private Integer xueshengDelete;

	public GuzhangshangbaoCommentbackView() {

	}

	public GuzhangshangbaoCommentbackView(GuzhangshangbaoCommentbackEntity guzhangshangbaoCommentbackEntity) {
		try {
			BeanUtils.copyProperties(this, guzhangshangbaoCommentbackEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}













				//级联表的get和set guzhangshangbao
					/**
					* 获取：故障上报 的 学生
					*/
					public Integer getGuzhangshangbaoXueshengId() {
						return guzhangshangbaoXueshengId;
					}
					/**
					* 设置：故障上报 的 学生
					*/
					public void setGuzhangshangbaoXueshengId(Integer guzhangshangbaoXueshengId) {
						this.guzhangshangbaoXueshengId = guzhangshangbaoXueshengId;
					}

					/**
					* 获取： 任务编号
					*/
					public String getGuzhangshangbaoUuidNumber() {
						return guzhangshangbaoUuidNumber;
					}
					/**
					* 设置： 任务编号
					*/
					public void setGuzhangshangbaoUuidNumber(String guzhangshangbaoUuidNumber) {
						this.guzhangshangbaoUuidNumber = guzhangshangbaoUuidNumber;
					}
					/**
					* 获取： 区域
					*/
					public Integer getQuyuTypes() {
						return quyuTypes;
					}
					/**
					* 设置： 区域
					*/
					public void setQuyuTypes(Integer quyuTypes) {
						this.quyuTypes = quyuTypes;
					}


						/**
						* 获取： 区域的值
						*/
						public String getQuyuValue() {
							return quyuValue;
						}
						/**
						* 设置： 区域的值
						*/
						public void setQuyuValue(String quyuValue) {
							this.quyuValue = quyuValue;
						}
					/**
					* 获取： 所在区域
					*/
					public String getGuzhangshangbaoAddress() {
						return guzhangshangbaoAddress;
					}
					/**
					* 设置： 所在区域
					*/
					public void setGuzhangshangbaoAddress(String guzhangshangbaoAddress) {
						this.guzhangshangbaoAddress = guzhangshangbaoAddress;
					}
					/**
					* 获取： 故障信息
					*/
					public String getGuzhangshangbaoGuzhang() {
						return guzhangshangbaoGuzhang;
					}
					/**
					* 设置： 故障信息
					*/
					public void setGuzhangshangbaoGuzhang(String guzhangshangbaoGuzhang) {
						this.guzhangshangbaoGuzhang = guzhangshangbaoGuzhang;
					}
					/**
					* 获取： 故障类型
					*/
					public Integer getGuzhangshangbaoTypes() {
						return guzhangshangbaoTypes;
					}
					/**
					* 设置： 故障类型
					*/
					public void setGuzhangshangbaoTypes(Integer guzhangshangbaoTypes) {
						this.guzhangshangbaoTypes = guzhangshangbaoTypes;
					}


						/**
						* 获取： 故障类型的值
						*/
						public String getGuzhangshangbaoValue() {
							return guzhangshangbaoValue;
						}
						/**
						* 设置： 故障类型的值
						*/
						public void setGuzhangshangbaoValue(String guzhangshangbaoValue) {
							this.guzhangshangbaoValue = guzhangshangbaoValue;
						}
					/**
					* 获取：故障上报 的 维修人员
					*/
					public Integer getGuzhangshangbaoWeixiuyuanId() {
						return guzhangshangbaoWeixiuyuanId;
					}
					/**
					* 设置：故障上报 的 维修人员
					*/
					public void setGuzhangshangbaoWeixiuyuanId(Integer guzhangshangbaoWeixiuyuanId) {
						this.guzhangshangbaoWeixiuyuanId = guzhangshangbaoWeixiuyuanId;
					}

					/**
					* 获取： 处理结果
					*/
					public Integer getChulijieguoTypes() {
						return chulijieguoTypes;
					}
					/**
					* 设置： 处理结果
					*/
					public void setChulijieguoTypes(Integer chulijieguoTypes) {
						this.chulijieguoTypes = chulijieguoTypes;
					}


						/**
						* 获取： 处理结果的值
						*/
						public String getChulijieguoValue() {
							return chulijieguoValue;
						}
						/**
						* 设置： 处理结果的值
						*/
						public void setChulijieguoValue(String chulijieguoValue) {
							this.chulijieguoValue = chulijieguoValue;
						}













				//级联表的get和set xuesheng
					/**
					* 获取： 学生姓名
					*/
					public String getXueshengName() {
						return xueshengName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setXueshengName(String xueshengName) {
						this.xueshengName = xueshengName;
					}
					/**
					* 获取： 身份证号
					*/
					public String getXueshengIdNumber() {
						return xueshengIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setXueshengIdNumber(String xueshengIdNumber) {
						this.xueshengIdNumber = xueshengIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getXueshengPhone() {
						return xueshengPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setXueshengPhone(String xueshengPhone) {
						this.xueshengPhone = xueshengPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getXueshengPhoto() {
						return xueshengPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setXueshengPhoto(String xueshengPhoto) {
						this.xueshengPhoto = xueshengPhoto;
					}
					/**
					* 获取： 假删
					*/
					public Integer getXueshengDelete() {
						return xueshengDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setXueshengDelete(Integer xueshengDelete) {
						this.xueshengDelete = xueshengDelete;
					}



}
