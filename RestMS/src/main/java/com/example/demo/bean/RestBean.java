package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RestBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int restId;  //primary key
	private String restName;
	private String restDesc;
	
	public int getRestId() {
		return restId;
	}
	public void setRestId(int restId) {
		this.restId = restId;
	}
	public String getRestName() {
		return restName;
	}
	public void setRestName(String restName) {
		this.restName = restName;
	}
	public String getRestDesc() {
		return restDesc;
	}
	public void setRestDesc(String restDesc) {
		this.restDesc = restDesc;
	}
	public RestBean(int restId, String restName, String restDesc) {
		super();
		this.restId = restId;
		this.restName = restName;
		this.restDesc = restDesc;
	}
	public RestBean() {
		super();
	}
	@Override
	public String toString() {
		return "RestBean [restId=" + restId + ", restName=" + restName + ", restDesc=" + restDesc + "]";
	}

}
