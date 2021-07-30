package tasks4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskOne {

	
	public static void main(String[] args) {
		String input = args[0];
		String output = args[1];
		System.out.println(input);
		System.out.println(output);
		String str="";
		String answer="";
		File file = new File(input);
		if(file.exists()) {
			try {
			FileInputStream fin = new FileInputStream(file);
				int i =0;
				while((i =fin.read()) != -1) {
					str = str + (char)i;
				}
				
				System.out.println("Do you want to override the output file");
				InputStreamReader in = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(in);
				answer = br.readLine();
				if(answer.equals("yes")) {
					FileOutputStream fout = new FileOutputStream(output);
					fout.write(str.getBytes());
				}
				if(answer.equals("no")) {
					FileOutputStream fout = new FileOutputStream(output,true);
					fout.write(str.getBytes());
				}
			}
			catch(FileNotFoundException e) {
				System.out.println("File not found");
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
