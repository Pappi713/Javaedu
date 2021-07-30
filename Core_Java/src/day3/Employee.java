package day3;

public class Employee {

	private int id;
	private String name;
	private float salary;
	
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int hashCode() {
		return id;
	}
	
	public String toString() {
		
		return "ID: " + id + " Name " + name + " Salary: " + salary;
	}
	
	public boolean equals(Object obj) {
		Employee emp = (Employee)obj;
		if(this.id == emp.id && this.name .equals(emp.name)&& this.salary == emp.salary ) {
			return true;
		}
		
		return false;
	}
	
	protected void finalize() {
		System.out.println("Finalize() in Employee");
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp1 = new Employee(101,"Feri", 9000f);
		
		Employee emp2 = (Employee) emp1.clone();
		
		System.out.println(emp1);
		System.out.println(emp2);
	}
}
