package com.tony.aop.service.impl;

import org.springframework.stereotype.Service;

import com.tony.aop.service.CustomerBoService;


/**
 * @author songyu.li@yeepay.com
 * @createDatetime 2016年3月15日 下午6:27:06
 */

@Service
public class CustomerBoImpl implements CustomerBoService {

	@Override
	public void addCustomer(){
		System.out.println("addCustomer() is running ");
	}
	
	@Override
	public String addCustomerReturnValue(){
		System.out.println("addCustomerReturnValue() is running ");
		return "abc";
	}
	
	@Override
	public void addCustomerThrowException() throws Exception {
		System.out.println("addCustomerThrowException() is running ");
		throw new Exception("Generic Error");
	}
	
	@Override
	public void addCustomerAround(String name){
		System.out.println("addCustomerAround() is running, args : " + name);
	}
}
