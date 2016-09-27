package com.tony.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tony.aop.service.CustomerBoService;

/**
 * @author songyu.li@yeepay.com
 * @createDatetime 2016年3月15日 下午7:05:25
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class LoggingAspectTest {

	@Autowired
	private CustomerBoService customerBoService;
	
	@Test
	public void testBeforeAndAfter() {
		customerBoService.addCustomer();
	}
	
	@Test
	public void testAfterReturn(){
		customerBoService.addCustomerReturnValue();
	}
	
	@Test
	public void testCustomerThrowException() throws Exception{
		customerBoService.addCustomerThrowException();
	}
	
	@Test
	public void testAround(){
		customerBoService.addCustomerAround("myArround");
	}
}
