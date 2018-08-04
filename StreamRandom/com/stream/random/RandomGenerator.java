package com.stream.random;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.stream.writeFile.WriteFile;

public class RandomGenerator {
	public static void main(String args[]) throws IOException {
	
		//Generating Random Numbers
		Random rand=new Random();
		Scanner scanner=new Scanner(System.in);
		
		
		//Accepting the path from the users
		System.out.println("Enter the path");
		String file_path=scanner.nextLine();
		
		//Calling the function to write to a file by passing the file path and the decision 
		// whether to append to the  existing data 
		WriteFile write_file=new WriteFile(file_path, true);
		for(int i=0;i<100;i++)
		{
			write_file.writeToFile(""+rand.nextInt(50));
			System.out.println("\n");
		}
		
		Scanner s=new Scanner(new File(file_path));
		
		//Creating a tree set
		Set<Integer> set=new TreeSet<>();
		
		//adding numbers to the list
		while(s.hasNextInt())
		{
			set.add(s.nextInt());
		}
		s.close();
		
		//displaying all the distinct numbers in a sorted manner
		set.stream().distinct().sorted().forEach(System.out::println);
	}
	
	
}

