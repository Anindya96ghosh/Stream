package com.streams.operations;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PerformOperations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the  number");
		int number = scanner.nextInt();
		
		if(isOdd().test(number))
			System.out.println("Number is odd");
		else
			System.out.println("Number is even");
		if(isPrime().test(number))
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
		if(isPalindrome().test(number))
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");
					
		
		scanner.close();

	}

	//logic to check whether the number is odd
	private static Predicate<Integer> isOdd() {
		Predicate<Integer> isOdd = n -> n % 2 != 0;
		return isOdd;
	}

	
	//logic to check whether the number is prime
	private static Predicate<Integer> isPrime() {
		Predicate<Integer> isPrime = n -> n > 1 && IntStream.range(2, n - 1).noneMatch(i -> n % i == 0);
		return isPrime;
	}

	
	//logic to check whether the number is palindrome
	private static Predicate<Integer> isPalindrome(){
		Predicate<Integer> isPalindrome = n -> Integer.toString(n).equals(new StringBuilder(Integer.toString(n)).reverse().toString());
		return isPalindrome;
	}

}
