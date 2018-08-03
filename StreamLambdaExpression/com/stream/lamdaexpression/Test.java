package com.stream.lamdaexpression;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<Integer>();
		
		Random rand=new Random();
		for(int i=0;i<10000;i++)
		{
			list.add(rand.nextInt(100));
			
		}
		
		Predicate<Integer> isEven=number -> number%2==0;
		Predicate<Integer> isOdd=number -> number%2!=0;
		Predicate<Integer> isDivisibleBy6=number -> number%6==0;
		Predicate<Integer> isLessThan12=number -> number<=12;
		Predicate<Integer> isGreaterThan50=number -> number>=50;
		
		
		//list.stream().forEach(System.out::println);
		list.stream().filter(isEven).forEach(System.out::println);
		
		
	}

}
