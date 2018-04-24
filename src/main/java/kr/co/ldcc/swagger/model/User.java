package kr.co.ldcc.swagger.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.google.gson.Gson;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "사용자 모델", description = "사용자 모델입니다.")
@Entity(name = "lt_user")
public class User implements Serializable {
	//
	@Id
	@ApiModelProperty(required = true, value="사용자 아이디(필수)")
	private String userId;
	
	@Column
	private String userName;
	
	@Column
	private String company;
	
	public User() {
		
	}
	
	public User(String userId, String userName, String company) {
		this.userName = userName;
		this.userId = userId;
		this.company = company;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String toJson() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}
}
