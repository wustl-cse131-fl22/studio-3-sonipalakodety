package studio3;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve {
	
	public static void arrayPrint(boolean arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == true) {
				System.out.println(i);
			}	
		}	
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What is your number limit? ");
		int maxNumber = in.nextInt();
		
		boolean[] primeArray = new boolean[maxNumber];
		Arrays.fill(primeArray, true);
		for (int i = 0; i < primeArray.length; i++) {
			
			
			if (i>0) {
				primeArray[i] = false;	
			}
			
			
		}
		
		arrayPrint(primeArray);
	}

}
