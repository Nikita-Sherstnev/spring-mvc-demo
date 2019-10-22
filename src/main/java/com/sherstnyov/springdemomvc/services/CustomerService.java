package com.sherstnyov.springdemomvc.services;

import com.sherstnyov.springdemomvc.CustomerRepository;
import com.sherstnyov.springdemomvc.models.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public Customer saveToDatabase(Customer customer){
        customerRepository.save(customer);
        return customer;
    }
}
