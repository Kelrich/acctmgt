package com.ibm.cams.gh.bankonline.cams_gh_bankonline.repository;

import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long>{

	List<Account> findAll();

	List<Account> findById(String id);
	
//	List<Account> findByFirstname(String firstname);
	
	
//	Account findByRole(String role);
}