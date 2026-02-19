package edu.icet.service.impl;

import edu.icet.dto.CustomerDto;
import edu.icet.repository.CustomerRepository;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    final CustomerRepository repository;

    @Override
    public void addCustomer(CustomerDto customerDto) {
        repository.addCustomer(customerDto);
    }

    @Override
    public void updateCustomer(CustomerDto customerDto) {

    }

    @Override
    public void deleteCustomer(String id) {

    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        return repository.getAllCustomers();
    }
}
