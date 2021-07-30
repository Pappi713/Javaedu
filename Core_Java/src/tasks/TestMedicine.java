package tasks;

public class TestMedicine {
	public static void main(String[] args) {
		Medicine[] meds = new Medicine[3];
		Tablet tablet = new Tablet();
		Syrup syrup = new Syrup();
		Ointment ointment = new Ointment();
		meds[0] = tablet;
		meds[1] = syrup;
		meds[2] = ointment;
	}
}
