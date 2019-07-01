package com.ibm.cams.gh.bankonline.cams_gh_bankonline.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.Account;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.AccountUI;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.repository.AccountRepository;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	AccountRepository accountRepo;
	
	@GetMapping("/bulkcreate")
	public void bulkcreate(){
		accountRepo.save(new Account("FFF111FF11", "Raquel", "Taytay"));
	}
	
	@GetMapping
	public List<Account> getAccountList() {
		
		List<Account> accounts = accountRepo.findAll();
		
		return accounts;
	}
	
	@GetMapping("/{id}")
	public List<Account> getAccountById(@PathVariable("id") String id) {
			List<Account> account = accountRepo.findById(id);		
			return account;
	}
	
//	@RequestMapping("/{firstname}")
//	public List<Account> getAccountByFirstname(@PathVariable String firstname){
//		List<Account> account = accountRepo.findByFirstname(firstname);
//		return account;
//	}
	
	
	@PostMapping("/add")
	public void create(@RequestBody AccountUI account) {
		accountRepo.save(new Account(account.getId(), account.getFirstname(), account.getLastname()));
	}
	
}