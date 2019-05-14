package com.eltaieb.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service()
public class ContractFacadeImpl implements ContractFacade {

	Map<String, String> contactTypesMap = new HashMap<>();

	@PostConstruct
	public void init() {
		constrctContractTypesMap();
	}

	private void constrctContractTypesMap() {
		contactTypesMap.put("electricity", "processed Electricity");
		contactTypesMap.put("dsl", "processed DSL");
		contactTypesMap.put("appartment_rent", "Processed appartment");
		contactTypesMap.put("newType", "Newly added type without touching process contract method");

	}

	@Override
	public String processContract(String type) {
		return contactTypesMap.get(type);
	}

}
