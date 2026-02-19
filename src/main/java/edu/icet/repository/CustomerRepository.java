package edu.icet.repository;

import edu.icet.dto.CustomerDto;

import java.util.List;

public interface CustomerRepository {

    void addCustomer(CustomerDto customerDto);

    void updateCustomer(CustomerDto customerDto);

    void deleteCustomer(String id);

    List<CustomerDto> getAllCustomers();
}
