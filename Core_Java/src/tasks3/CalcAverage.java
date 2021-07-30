package tasks3;

public class CalcAverage {
	public static double avgFirstN(int N) throws IllegalArgumentException {
		double average =0;
		int sum =0;
		
		if(N < 0) {
			throw new IllegalArgumentException();
		}
		else {
			for(int i=1; i<N ; i++) {
				sum = sum+i;
				average = (double)sum/N;
			}
		}
		return average;
	}
	
	public static void main(String[] args) {
		
		try {
			System.out.println(avgFirstN(16));
		}
		catch(IllegalArgumentException e) {
			System.out.println("Number is not Natural");
		}
	}
}
