package com.saviya.api.product.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "geo_location")
@NamedQuery(name = "GeoLocation.findAll", query = "SELECT p FROM GeoLocation p")
@Data
@NoArgsConstructor
public class GeoLocation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Double latitude;

	private Double longitude;
}
