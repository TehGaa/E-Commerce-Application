package com.app.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entites.Bank;
import com.app.payloads.BankTransferDTO;
import com.app.repositories.BankRepo;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private BankRepo bankRepo;

    public BankTransferDTO getTransfer(String bankName) {
        Bank bank = bankRepo.findByBankName(bankName);
        return new BankTransferDTO(bank);
    }
}
