package com.saviya.api.product.service.impl;

import org.springframework.stereotype.Service;

import com.saviya.api.product.dto.RequestDto;
import com.saviya.api.product.dto.ResponseDto;
import com.saviya.api.product.model.Business;
import com.saviya.api.product.repository.BusinessRepository;
import com.saviya.api.product.service.BusinessService;

@Service
public class BusinessServiceImpl implements BusinessService {

	private final BusinessRepository businessRepository;

	public BusinessServiceImpl(final BusinessRepository businessRepository) {
		this.businessRepository = businessRepository;
	}

	@Override
	public ResponseDto addBusiness(RequestDto requestDto) {

		// convert entity
		Business bus = new Business();
		businessRepository.save(bus);

		return null;
	}

}
