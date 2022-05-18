package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.ApiModel;
import com.example.demo.model.ApiModel2;
import com.example.demo.model.ApiModel3;

@Service
public class ApiService {
	
	@Autowired
	public RestTemplate resttemplate;
	
	public ApiModel2 ApiResponse() {
		return resttemplate.getForObject(
				"https://zoo-animal-api.herokuapp.com/animals/rand"
, ApiModel2.class);
	}
	public ApiModel ApiSecond() {
		return resttemplate.getForObject(
				"https://x-colors.herokuapp.com/api/random"
, ApiModel.class);
	}
	public ApiModel3 ApiThird() {
		return resttemplate.getForObject(
				"https://zoo-animal-api.herokuapp.com/animals/rand"
, ApiModel3.class);
	}
	
	

}
