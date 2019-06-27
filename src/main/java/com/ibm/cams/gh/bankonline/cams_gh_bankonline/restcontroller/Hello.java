package com.ibm.cams.gh.bankonline.cams_gh_bankonline.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.Customer;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class Hello {
	
	@Autowired
	CustomerRepository customerRepo;
	
	@GetMapping
	public List<Customer> getCustomerList() {
		
		List<Customer> customers = customerRepo.findAll();
		
		return customers;
	}
	
	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable("id") long id) {
			
			Customer customer = customerRepo.findById(id).orElseThrow(null);
			
			return customer;
	}

	@GetMapping("/addDummy")
	public void dummyData() {
		
		Customer newCustomer = new Customer();
		newCustomer.setFirstName("Jasmine");
		newCustomer.setLastName("Princeess");
		
		customerRepo.save(newCustomer);
	}
	
	
}