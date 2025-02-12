package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.app.payloads.BankTransferDTO;
import com.app.services.PaymentService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("/api")
@SecurityRequirement(name = "E-Commerce Application")
public class PaymentController {

	@Autowired
	public PaymentService paymentService;

	@GetMapping("public/payments/transfer/{bankName}")
	public ResponseEntity<BankTransferDTO> getTransfer(@PathVariable String bankName) {
		BankTransferDTO bank = paymentService.getTransfer(bankName);
		return new ResponseEntity<BankTransferDTO>(bank, HttpStatus.OK);
	}
}
