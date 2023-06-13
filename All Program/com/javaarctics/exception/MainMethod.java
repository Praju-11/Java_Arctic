package com.javaarctics.exception;

import java.util.Scanner;

class TooYoung extends RuntimeException{
	TooYoung(String s){
		super(s);
	}
}

class TooOld extends RuntimeException{
	TooOld(String s){
		super(s);
	}
}
public class MainMethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		
		if(age > 60) {
			throw new TooOld("You are age is too old. ");
		}else if(age < 18) {
			throw new TooYoung("You are too young for marriage");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args)
//	{
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your age");
//		int age = sc.nextInt();
//		
//		if(age > 60) {
//			throw new TooOld("You are too old for marriage");
//			
//		}else if(age < 18) {
//			throw new TooYoung("You are too young for marriage");
//		}
//	}
}
