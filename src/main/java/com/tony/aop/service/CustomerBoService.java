package com.tony.aop.service;

/**
 * @author songyu.li@yeepay.com
 * @createDatetime 2016年3月15日 下午6:25:58
 */

public interface CustomerBoService {

	public void addCustomer();
	
	public String addCustomerReturnValue();
	
	public void addCustomerThrowException() throws Exception;
	
	public void addCustomerAround(String name);
	
}
