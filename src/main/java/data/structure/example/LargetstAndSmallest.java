package data.structure.example;

import org.junit.jupiter.api.Test;

public class LargetstAndSmallest {

	public void printLargetAndSmallest(int[] list) {
		int smaller = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		
		for(int counter=0; counter< list.length; counter++) {
			
			if(smaller > list[counter]) {
				smaller = list[counter];
			}
			
			if(largest < list[counter]) {
				largest = list[counter];
			}
		}
		
		
		System.out.println("Largest is : " + largest );
		System.out.println("Smaller is : " + smaller );
	}
	
	@Test
	public void test() {
		int arr[] = {12, 13, 67,1, 10, 34, 1}; 
		printLargetAndSmallest(arr);
	}
}
