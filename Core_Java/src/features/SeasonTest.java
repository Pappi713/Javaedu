package features;

import java.util.Scanner;

public class SeasonTest {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Season");
		String input = sc.next();
		
		Season[] seasons =Season.values();
		boolean status =false;
		for (Season s : seasons) {
			if(s.toString().equals(input)) {
				status =true;
				System.out.println("Valid Season");
				break;
			}
		}
		if(status == false) {
			System.out.println("Invalid Season");
		}
		
		System.out.println(Season.WINTER.getNumber());
	}
	
}
