package com.saviya.api.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saviya.api.product.dto.RequestDto;
import com.saviya.api.product.dto.ResponseDto;
import com.saviya.api.product.service.BusinessService;

@RestController
@RequestMapping("v1/hela/business")
public class BusinessController {

	private final BusinessService businessService;

	@Autowired
	public BusinessController(final BusinessService businessService) {
		this.businessService = businessService;
	}

	@PostMapping()
	public ResponseEntity<?> addBusiness(@RequestBody RequestDto requestDto) {

		ResponseDto res = businessService.addBusiness(requestDto);

		return new ResponseEntity<ResponseDto>(res, HttpStatus.OK);

	}

}
