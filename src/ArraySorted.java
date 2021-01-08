/**
 * Create a method which accepts an integer array, 
 * reverse the numbers in the array and 
 * returns the resulting array in sorted order 
 * 
 * @author Haritha
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorted {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of the Array");
		int n = sc.nextInt();
		
		System.out.println("Enter the array of integers");
		int arr[] = new int[n];
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Reversed Array of Integers");
		for(int i = arr.length-1;i>=0;i--) {
			System.out.print(arr[i] + " " );
		}
		
		
		
		
		
			

	}
}


