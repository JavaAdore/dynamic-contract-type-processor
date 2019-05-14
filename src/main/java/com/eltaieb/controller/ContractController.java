package com.eltaieb.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eltaieb.service.ContractFacade;

@RestController
@RequestMapping("contract")
public class ContractController {

	private ContractFacade contactFacade;

	public ContractController(ContractFacade contactFacade) {
		super();
		this.contactFacade = contactFacade;
	}

	@RequestMapping("type/{type}")
	public Object contactType(@PathVariable("type") String type) {
		Object result =  contactFacade.processContract(type);
		if(null == result)
		{
			return "No data for such input";
		}
		return result; 
	}

}
