package com.ibm.cams.gh.bankonline.cams_gh_bankonline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

List<Customer> findByFirstName(String FirstName);

List<Customer> findAll();

}