package com.example.demo.service;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.RestBean;
import com.example.demo.dao.RestDAO;

@Service
public class RestService {
	
	
	@Autowired
	RestDAO restDao;
	
	public Iterable<RestBean> getAllRest(){
		return restDao.findAll();
	}
	
	public RestBean getRestBean(Integer restId) {
		return restDao.findById(restId).get();
	}

	public RestBean updateRestBean(int id, RestBean rs) {
		RestBean RestBean = restDao.findById(id).get();
		
		if(Objects.nonNull(rs.getRestName()) && !"".equalsIgnoreCase(rs.getRestName())) {
			RestBean.setRestName(rs.getRestName());
		}
		if(Objects.nonNull(rs.getRestDesc()) && !"".equalsIgnoreCase(rs.getRestDesc())) {
			RestBean.setRestName(rs.getRestName());
		}
		
		return restDao.save(RestBean);
	}

	public void deleteRestaurantById(int id) {
		// TODO Auto-generated method stub
		restDao.deleteById(id);
	}

	public RestBean  saveRestaurant(RestBean restBean) {
		return restDao.save(restBean);
	}

	public void deleteAllRestaurant() {
		restDao.deleteAll();
	}
	
 }
