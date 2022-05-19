package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ApiModel;
import com.example.demo.model.ApiModel2;
import com.example.demo.model.ApiModel3;
import com.example.demo.service.ApiService;


@RestController
public class ApiController {
	
	@Autowired
	public ApiService apiservice;
	
	@PostMapping("/firstresponse")
	public ResponseEntity<ApiModel2> fetchData(){
		return new ResponseEntity<>(apiservice.apiAnimal(),HttpStatus.OK);
	}
	
	@PostMapping("/secondresponse")
	public ResponseEntity<ApiModel> secondData(){
		return new ResponseEntity<>(apiservice.apiXcolors(),HttpStatus.OK);
	}

	@PostMapping("/thirdresponse")
	public ResponseEntity<ApiModel3> thirdData(){
		return new ResponseEntity<>(apiservice.apiAnimals(),HttpStatus.OK);
	}


}
