package com.hcl.analyzer.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@Data
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "transactionId")
public class TransactionDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long transactionId;
	
	private LocalDate transactionDate;
	
	private String transactionType;
	
	private Double transactionAmount;
	
	private String transactionStatus;
	
	private Integer transactionOtp;
	
	private Double availableBalance;
	
	private String transactionDescription;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private CustomerDetails customerDetails;
}
