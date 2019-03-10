package data.structure.example;

import junit.framework.TestCase;

public class MissingNumberInArrayTest extends TestCase{
	public void test() {
		MissingNumberInArray missingNumberInArray = new MissingNumberInArray();
		missingNumberInArray.printMissingArray(new int[]{1, 3, 4, 6, 7, 9, 8, 10}, 10);
	}

}
