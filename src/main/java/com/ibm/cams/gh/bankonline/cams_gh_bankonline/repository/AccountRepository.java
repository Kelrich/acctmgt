package com.ibm.cams.gh.bankonline.cams_gh_bankonline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

	List<Account> findAll();

	Account findById(String id);
	
//	Account findByRole(String role);
}