
package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoanController {
	/*@Autowired
	AccountService accountService;*/
	
	@GetMapping("/loan/{number}")
	public String num (@PathVariable String number) {
		System.err.println("Loan working");
		return "{ number: H00987987972342, type: car, loan: 400000, emi: 3258, tenure: 18 }" ;
	}
	@GetMapping("/hello")
	public String num () {
		System.err.println("");
		return  "hello" ;
	}
}
