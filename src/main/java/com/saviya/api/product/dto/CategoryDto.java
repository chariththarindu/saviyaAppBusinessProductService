package com.saviya.api.product.dto;

import lombok.Data;

@Data
public class CategoryDto {

	private int id;
	
	private String name;
	
	private String displayName;
	
	private String code;
	
	private int status;
}
