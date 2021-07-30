package tasks3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

import pack1.HelloWorld;

public class Palindrome {
	
	public static void main(String[] args) {
		
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		System.out.println("Provide a world");
		String word = "";
		try {
			word = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		char[] ch = word.toCharArray();
		char[] newArray = new char[ch.length];
		for(int i =0 ; i< ch.length; i++) {
			newArray[ch.length-i-1] = ch[i];
		}
		String reversedWord =  new String(newArray);
		System.out.println(reversedWord);
		if(word.equals(reversedWord)) {
			System.out.println("YEs It is palindrom");
		}
		else {
			System.out.println("Nope");
		}
		
	}
}
