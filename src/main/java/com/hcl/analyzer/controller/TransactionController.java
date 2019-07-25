package com.hcl.analyzer.controller;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.analyzer.dto.MonthlyStatementDto;
import com.hcl.analyzer.service.TransactionHistoryService;

@RestController
@RequestMapping("/transaction")
@CrossOrigin
public class TransactionController {
	
	@Autowired
	private TransactionHistoryService transactionHistoryService;
	
	@GetMapping("/monthlyhistory/{customerId}")
	public ResponseEntity<List<MonthlyStatementDto>> getMonthlyStatement(@PathVariable("customerId") @NotNull Long customerId){
		return new ResponseEntity<>(transactionHistoryService.getMonthlyStatement(customerId), HttpStatus.ACCEPTED);
	}
}
