package features;

public class VarArgsDemo {

	int add(int a, int b, int... c)	{
		int result =0;
		
		for (int i = 0; i < c.length; i++) {
			result = result + c[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		VarArgsDemo obj = new VarArgsDemo();
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(10,20,30));
		System.out.println(obj.add(10,20,40));
		System.out.println(obj.add(10,20));
	}
	
}
