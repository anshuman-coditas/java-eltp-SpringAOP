package com.example.demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BeforeAfter {
	@Before("execution(public void display())")
	public void dis1() {
		System.out.println("Displaying..");
	}
	
	@Around("execution(public void display())")
	public void dis3() {
		System.out.println("Around..");
	}
	
	@After("execution(public void display())")
	public void dis2() {
		System.out.println("Displaying Done..");
	}
	

}
