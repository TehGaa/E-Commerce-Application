package com.app.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entites.Bank;
import com.app.payloads.BanksDTO;
import com.app.repositories.BankRepo;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class BankServiceImpl implements BankService{

    @Autowired
    private BankRepo bankRepo;

    public BanksDTO getBankNames(){
        BanksDTO banksDTO = new BanksDTO(Arrays.asList(
                bankRepo.findAll().stream().map(Bank::getBankName).toArray(String[]::new)));
        return banksDTO;
    };
}
