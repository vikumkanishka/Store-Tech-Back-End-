package edu.icet.service.impl;

import edu.icet.dto.CustomerDto;
import edu.icet.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public void addCustomer(CustomerDto customerDto) {

    }

    @Override
    public void updateCustomer(CustomerDto customerDto) {

    }

    @Override
    public void deleteCustomer(String id) {

    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        return List.of();
    }
}
