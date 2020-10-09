package com.ncjoshi.scmebrewery.services;

import com.ncjoshi.scmebrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * Created by ncj on 09 Oct, 2020.
 */
public interface CustomerService {
    CustomerDto getCustomerById(String customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);
}
