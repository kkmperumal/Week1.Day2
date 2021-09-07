package week1.day2;

import java.util.Arrays;

public class ArrayLargestSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = { 100, 3, 2, 4, 6, 5 };
		int Range = numArr.length;
		Arrays.sort(numArr);
		for(int i=0;i<Range;i++)
		{System.out.println("numArr["+i+"]" + numArr[i]);}
		System.out.println("Largest number is " + numArr[Range - 1]);
		System.out.println("Smalles number is " + numArr[0]);

	}

}
