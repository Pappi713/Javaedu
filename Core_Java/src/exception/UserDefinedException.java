package exception;

public class UserDefinedException {
	public static void main(String[] args)  {
		
		int id = Integer.parseInt(args[0]);
		String name = args[1];
		float salary = Float.parseFloat(args[2]);
		
		if(salary < 3000) {
			try {
				throw new LowSalaryException("Salary is less than 3000");
			}
			catch( LowSalaryException e) {
				System.out.println(e.getMessage());
			}
		}
		else {
			Employee emp = new Employee(id, name, salary);
			System.out.println(emp);
		}
		System.out.println("End of App");
	}
}
