package edu.icet.service;

import edu.icet.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

    void addCustomer(CustomerDto customerDto);

    void updateCustomer(CustomerDto customerDto);

    void deleteCustomer(String id);

    public List <CustomerDto> getAllCustomers();
}
