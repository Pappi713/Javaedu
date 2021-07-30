package pack1;

public class MainClass {
	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.setName("Kristof");
		person1.setAdress("Budapest");
		person1.setDateOfBirth("7 Aug");
		
		System.out.println("Person Details: ");
		System.out.println("Name: " + person1.getName());
		System.out.println("Adress: " + person1.getAdress());
		System.out.println("Date of Birth : " + person1.getDateOfBirth());
		
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("Feri");
		emp.setAdress("PEst");
		emp.setSalary(9000);
		emp.setDateOfBirth("5 Febr");
		
		System.out.println("Employee Details: ");
		System.out.println("Name: " + emp.getName());
		System.out.println("Adress: " + emp.getAdress());
		System.out.println("Date of Birth : " + emp.getDateOfBirth());
		System.out.println("Salaryh : " + emp.getSalary());
		System.out.println("ID : " + emp.getId());
		
		Manager manager = new Manager();
		manager.setId(101);
		manager.setName("Laci");
		manager.setAdress("PEst");
		manager.setSalary(29000);
		manager.setDateOfBirth("3 Febr");
		manager.setProjId(5);
		manager.setProjName("Java");
		
		System.out.println("Manager Details: ");
		System.out.println("Name: " + manager.getName());
		System.out.println("Adress: " + manager.getAdress());
		System.out.println("Date of Birth : " + manager.getDateOfBirth());
		System.out.println("Salaryh : " + manager.getSalary());
		System.out.println("ID : " + manager.getId());
		System.out.println("Project ID: " + manager.getProjId());
		System.out.println("Project name: " + manager.getProjName());
		
		Person obj = new Employee();
	}

}
