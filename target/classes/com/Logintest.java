package com;


import org.junit.Test;

import junit.framework.Assert;

public class Logintest 
{
	@Test
	public void test()
	 {
	    
	Login l = new Login();
	String s = l.acceptPassword("password");

	//@SuppressWarnings("unused")
	//int a=Integer.parseInt(s);
	String s1 = l.acceptUname("userName");
	//@SuppressWarnings("unused")
	//int b=Integer.parseInt(s1);
	Assert.assertEquals("password",s);
	Assert.assertEquals("userName",s1);
	
	 }

}
