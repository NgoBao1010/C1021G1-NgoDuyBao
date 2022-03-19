package com.codegym.th1.controller;

import com.codegym.th1.model.Customer;
import com.codegym.th1.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping
    public ResponseEntity<Iterable<Customer>> findAll(){
        List<Customer> customerList = (List<Customer>) customerService.findAll();
        if (customerList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(customerList,HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Customer> findById(@PathVariable Long id){
        Customer customers = customerService.findById(id);
        if (customers == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customers,HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<String> create(@Valid @RequestBody Customer customer){
        return ResponseEntity.ok(customer.getLastName());
    }
    @PostMapping
    public ResponseEntity<Customer> save(@RequestBody Customer customer){
        return new ResponseEntity<>(customerService.save(customer),HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Customer> update(@PathVariable Long id,@RequestBody Customer customer){
        Customer customer1 = customerService.findById(id);
        if (customer1 == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        customer.setId(customer1.getId());
        return new ResponseEntity<>(customerService.save(customer),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Customer> delete(@PathVariable Long id){
        Customer customer = customerService.findById(id);
        if (customer == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        customerService.remove(id);
        return new ResponseEntity<>(customer,HttpStatus.NO_CONTENT);
    }
}
