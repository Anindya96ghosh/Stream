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
	
		Random rand=new Random();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the path");
		String file_path=scanner.nextLine();
		
	
		WriteFile write_file=new WriteFile(file_path, true);
		for(int i=0;i<100;i++)
		{
			write_file.writeToFile(""+rand.nextInt(50));
			System.out.println("\n");
		}
		
		
		Scanner s=new Scanner(new File(file_path));
		Set<Integer> set=new TreeSet<>();
		
		while(s.hasNextInt())
		{
			set.add(s.nextInt());
		}
		s.close();
		
		set.stream().distinct().sorted().forEach(System.out::println);
	}
	
	
}

