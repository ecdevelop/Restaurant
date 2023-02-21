package com.example.demo.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.RestBean;
import com.example.demo.service.RestService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class RestResource {

	@Autowired
	RestService restService;
	
	@GetMapping("/allrestaurants")
	public List<RestBean> getAllRestaurants(){
		return (List<RestBean>) restService.getAllRest();
	}
	
	@GetMapping("/allrestaurants/{restId}")
	public RestBean getRestbean(@PathVariable Integer restId) {
		return restService.getRestBean(restId);
	}
	
	@PutMapping("/allrestaurants/updateRestaurant/{id}")
	public RestBean updateRestBean(@PathVariable("id") int id, @RequestBody RestBean rs) {
		return restService.updateRestBean(id,rs);
	}
	
	@DeleteMapping("/allrestaurants/deleteRestaurant/{id}")
	public String deleteRestaurantById(@PathVariable("id") int id) {
		restService.deleteRestaurantById(id);
		return "RestBean Deleted Successfully!";
	}
	
	@DeleteMapping("/allrestaurants/deleteAll")
	public String deleteAllRestaurant() {
		restService.deleteAllRestaurant();
		return "Delete all Successful!!!!";
	}
	
	@PostMapping("/allrestaurants/createRestaurant")
	public RestBean saveRestaurant(@RequestBody RestBean restBean) {
			return restService.saveRestaurant(restBean);
	}

	 
}
