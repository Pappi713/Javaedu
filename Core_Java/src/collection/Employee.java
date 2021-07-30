package collection;

public class Employee {
	private int id;
	private String name;
	private float salary;
	
	
	public Employee(int id, String name, float d) {
		super();
		this.id = id;
		this.name = name;
		this.salary = d;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public int hashCode() {
		return id;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Employee) {
			Employee emp = (Employee) obj;		
			if(this.name.equals(emp.name) && emp.salary == this.salary) return true;
		}
		return false;
		}
}
