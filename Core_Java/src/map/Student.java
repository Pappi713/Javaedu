package map;

public class Student {
	private int rollNo;
	private String name;
	private float percentage;
	
	public Student(int rollNo, String name, float percentage) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	public int hashCode() {
		return rollNo;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Student) {
			Student s = (Student) obj;
			if(s.name.equals(this.name) && this.percentage == s.percentage) {
				return true;
			}
		}
		return false;
	}
}
