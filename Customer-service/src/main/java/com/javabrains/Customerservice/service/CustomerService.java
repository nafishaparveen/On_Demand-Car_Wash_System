package com.javabrains.Customerservice.service;

import com.javabrains.Customerservice.model.Customer;
import com.javabrains.Customerservice.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CustomerService {

    private final CustomerRepository customerRepository;

    public void addCustomer(Customer customer) {
        customerRepository.insert(customer);
    }

    public void updateCustomer(Customer customer) {
        Customer savedCustomer = customerRepository.findById(customer.getId()).orElseThrow(() -> new RuntimeException(String.format("Cannot Find Customer by ID %s", customer.getId())));
        savedCustomer.setName(customer.getName());
        savedCustomer.setEmail(customer.getEmail());
        savedCustomer.setPhoneNo(customer.getPhoneNo());
        savedCustomer.setAddress(customer.getAddress());
        savedCustomer.setCardetails(customer.getCardetails());

        customerRepository.save(customer);
    }

    public Customer getCustomer(String name) {
        return customerRepository.findByName(name)
                .orElseThrow(() -> new RuntimeException(String.format("Cannot Find Customer by Name - %s", name)));
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public void deleteCustomer(String id) {
        customerRepository.deleteById(id);
    }
}
