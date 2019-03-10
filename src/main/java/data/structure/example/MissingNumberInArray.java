package data.structure.example;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumberInArray {
	
	public void printMissingArray(int[] numbers, int iCount) {
		int missingCount = iCount - numbers.length;
		BitSet bitSet = new BitSet();//BitSet(missingCount);

		for (int number : numbers) {
			bitSet.set(number - 1);
		}
	
			
		System.out.printf("Missing numbers in integer array %s, with total number %d is %n", 
				Arrays.toString(numbers), iCount);
		int lastMissingIndex = 0;

		for (int i = 0; i < missingCount; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}

	}

	 
	
	
}
