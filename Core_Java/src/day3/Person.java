package day3;

public class Person {
	
	private String name;
	private String dob;
	private Adress adress;
	
	
	public Person(String name, String dob, Adress adress) {
		super();
		this.name = name;
		this.dob = dob;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}


	public String getDob() {
		return dob;
	}


	public Adress getAdress() {
		return adress;
	}

	public static void main(String[] args) {
		Adress adress = new Adress("Alma", "korte", "barack", "sor");
		Person person = new Person("Ferike", "19th Sept", adress);
		
		System.out.println("Person detaols: ");
		System.out.println("Name" + person.getName());
		System.out.println("Date of Pirth" + person.getDob());
		Adress adr = person.getAdress();
		System.out.println("Adress" +" " + adr.getStreet()+" " + adr.getCity()+" " + adr.getState() +" " + adr.getCountry());
	}
	
} 
