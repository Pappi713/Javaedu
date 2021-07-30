package tasks;

public class Medicine {	
	
	private String name;
	private String adress;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public void  displayLabel() {
		System.out.println("Name of the medicine: " + name);
		System.out.println("Adress of the company: " + adress);
	}

}
