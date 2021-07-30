package day3;

public class Adress {
	
	private String street;
	private String city;
	private String country;
	private String state;
	
	public Adress(String street, String city, String country, String state) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	public String getState() {
		return state;
	}

	
}
