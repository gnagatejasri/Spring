package com.sahtya.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("Spring_config.xml");
       System.out.println("***********");
       //get the object from container call your methods.
       
       GreetingImp1 greetingImp1= context.getBean("greet",GreetingImp1.class);
       greetingImp1.greet();
    }
}
