package edu.icet.controller;

import edu.icet.dto.CustomerDto;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    final CustomerService service;

    @PostMapping("/add-customer")
    public void AddCustomer(CustomerDto customerDto) {
        service.addCustomer(customerDto);
    }
    @PutMapping("/update-customer")
    public void updateCustomer(@RequestBody CustomerDto customerDto){
        service.updateCustomer(customerDto);
    }
    @DeleteMapping("/delete-customer/{id}")
    public void deleteCustomer(@PathVariable String id){
        service.deleteCustomer(id);
    }
    @GetMapping("/get-all-customers")
    List<CustomerDto> getAllCustomers(){
        return service.getAllCustomers();
    }
}
