package com.sahtya.spring;

public class GreetingImp1 implements Greeting {

	@Override
	public void greet() {
		System.out.println("this is spring first ex");
		System.out.println("this is teja");
		
		
	}
	
	public GreetingImp1()
	{
		System.out.println("greeting counstructo::object created");
	}
}
