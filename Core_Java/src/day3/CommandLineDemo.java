package day3;

public class CommandLineDemo {
	
	public static void main(String[] args) {
		System.out.println("CommandLine arguments");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
