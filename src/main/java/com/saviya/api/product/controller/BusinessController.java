package com.saviya.api.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saviya.api.product.dto.RequestDto;
import com.saviya.api.product.dto.ResponseDto;
import com.saviya.api.product.service.BusinessService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("v1/saviya/business")
@Slf4j
public class BusinessController {

	private final BusinessService businessService;

	@Autowired
	public BusinessController(final BusinessService businessService) {
		this.businessService = businessService;
	}

	@PostMapping()
	public ResponseEntity<?> addBusinessProduct(@RequestBody RequestDto requestDto) {

		ResponseDto res = businessService.addBusiness(requestDto);

		return new ResponseEntity<ResponseDto>(res, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getBusinessProduct(@PathVariable String id) {

		ResponseDto res = ResponseDto.builder().code("101").message("response from :-" + id).build();

		return new ResponseEntity<ResponseDto>(res, HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<?> getBusinessProduct() {

		log.info("get business product call...");
		return new ResponseEntity<String>("status check.....:- working..", HttpStatus.OK);
		
	}
}
