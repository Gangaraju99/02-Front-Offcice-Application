package com.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StatusDetails {

	
	
	@Id
	@GeneratedValue
	private  Integer enquiryId;
	
	private String status;
}
