
package com.cognizant.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.Account;
import com.cognizant.service.AccountService;

@RestController
public class AccountController {
	/*@Autowired
	AccountService accountService;*/
	
	@GetMapping("/accounts/{number}")
	public String num (@PathVariable String number) {
		System.err.println("");
		return  "{number:0098798797343, type:savings, balance:234343}" ;
	}
	@GetMapping("/hello")
	public String num () {
		System.err.println("");
		return  "hello" ;
	}
}
