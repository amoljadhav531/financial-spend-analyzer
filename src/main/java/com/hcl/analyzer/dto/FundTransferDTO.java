package com.hcl.analyzer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FundTransferDTO {

	private long customerId;
	private String transactionType;
	private Double transferAmount;
	private String transactionDescription;
	
}
