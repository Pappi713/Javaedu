package day3;

public class ObjectDemo {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(101,"Feri", 9000f);
		
		Employee emp2 = new Employee(102,"Laci", 9500f);

		System.out.println(emp1.hashCode());
		
		System.out.println(emp1);
	
		Employee emp3 =  new Employee(101,"Feri", 9000f); 
	
		System.out.println(emp1.equals(emp3));
		
		emp2= null;
		System.gc();
		
		//emp1.clone();
	}
}
