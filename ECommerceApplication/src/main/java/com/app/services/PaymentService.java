package com.app.services;

import com.app.payloads.BankTransferDTO;

public interface PaymentService {
    BankTransferDTO getTransfer(String bankName);
}
