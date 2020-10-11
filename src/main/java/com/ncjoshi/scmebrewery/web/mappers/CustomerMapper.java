package com.ncjoshi.scmebrewery.web.mappers;

import com.ncjoshi.scmebrewery.domain.Customer;
import com.ncjoshi.scmebrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * Created by ncj on 11 Oct, 2020.
 */
@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
