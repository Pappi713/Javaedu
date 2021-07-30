package tasks;

import java.util.Iterator;

public class tasks {
	
	public static void main(String[] args) {
		taskOne(1,2,3);
		int[] taskTwoArray = new int[] {1,2,3,4,5,6,7,8,9,10};
		taskTwo(taskTwoArray);
		taskThree(6);
		taskFour(3325);
	}

	
	public static void taskOne(int a, int b, int c) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int [] numbers = new int[] {a,b,c};
		for(int i=0; i< numbers.length; i++) {
			if(numbers[i] < min) {
				min = numbers[i];
			}
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("Smallest number: " + min);
		System.out.println("Largest number: " + max);
	}
	
	public static void taskTwo(int[] array) {
		int sum =0;
		for (int i = 0; i < array.length; i++) {
			sum = sum+ array[i];
		}
		double average = (double)sum/array.length;
		System.out.println("The average of the 10 number is: " + average);
	}
	
	public static void taskThree(int number) {

		int factorial =1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println("FActorial: "+ factorial);
	}
	
	public static void taskFour(int number) {
		int numberOfDigits = 0;
		while(number != 0) {
			numberOfDigits += number %10;
			number = number/10;
		}
		System.out.println("the number of digits is: " + numberOfDigits);
	}
}
