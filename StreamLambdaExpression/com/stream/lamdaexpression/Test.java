package com.stream.lamdaexpression;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {

		//Creating ArrayList 
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		//Generating random numbers
		Random rand=new Random();
		for(int i=0;i<10000;i++)
		{
			list.add(rand.nextInt(100));
		}
		
		//Implementing logic 
		Predicate<Integer> isEven=number -> number%2==0;
		Predicate<Integer> isOdd=number -> number%2!=0;
		Predicate<Integer> isDivisibleBy6=number -> number%6==0;
		Predicate<Integer> isLessThan12=number -> number<=12;
		Predicate<Integer> isGreaterThan50=number -> number>=50;
		
		//printing the list based on the conditions
		
		System.out.println("All the numbers that are even are ");
		list.stream().filter(isEven).forEach(System.out::println);
		
		
		System.out.println("=================================================================== ");
		System.out.println("All the numbers that are odd are ");
		list.stream().filter(isOdd).forEach(System.out::println);
		
		
		System.out.println("=================================================================== ");
		System.out.println("All the numbers that are divisible by 6 are ");
		list.stream().filter(isDivisibleBy6).forEach(System.out::println);
		
		
		System.out.println("=================================================================== ");
		System.out.println("All the numbers that are less than 12 are ");
		list.stream().filter(isLessThan12).forEach(System.out::println);
		
		
		System.out.println("=================================================================== ");
		System.out.println("All the numbers that are greater than 50 are ");
		list.stream().filter(isGreaterThan50).forEach(System.out::println);
		
		
	}

}
