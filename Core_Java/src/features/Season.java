package features;

public enum Season {
	
	
	FALL(10),SUMMER(20),WINTER,RAINY;
	
	int number;
	private Season(int number) {
		this.number = number;
		System.out.println("Season ParamCOnst");
	}
	Season(){
		System.out.println("Season DEf Constr");
	}
	public int getNumber() {
		return number;
	}
	
}
