package com.microservice.accounts.service;

import com.microservice.accounts.dto.CustomerDto;

public interface IAccountService {
    void createAccount(CustomerDto customer);

    CustomerDto fetchAccount(String mobileNumber);

    Boolean updateAccount(CustomerDto customer);

    Boolean deleteAccount(String phoneNumber);
}
