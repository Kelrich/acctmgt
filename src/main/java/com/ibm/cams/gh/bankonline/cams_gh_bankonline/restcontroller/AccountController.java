package com.ibm.cams.gh.bankonline.cams_gh_bankonline.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.Account;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.repository.AccountRepository;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	AccountRepository accountRepo;
	
	@GetMapping
	public List<Account> getAccountList() {
		
		List<Account> accounts = accountRepo.findAll();
		
		return accounts;
	}
	
	@GetMapping("/{id}")
	public Account getAccountById(@PathVariable("id") String id) {
			Account account = accountRepo.findById(id);		
			return account;
	}
//	
//	@GetMapping("/{role}")
//	public Account getAccountByRole(@PathVariable("role") String role) {
//			Account account = accountRepo.findByRole(role);
//			return account;
//	}
	
	@PostMapping("/add")
	Account newAccount(@RequestBody Account newAccount) {
		newAccount.setId("XXD231FS12");
		newAccount.setFirstname("Raquel");
		newAccount.setLastname("Taytay");
		
		return accountRepo.save(newAccount);
	}
	
}