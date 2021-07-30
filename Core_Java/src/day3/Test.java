package day3;

public interface Test {
	
	int number =100; //public final static
	void show();
	void display();
}

interface Test1 extends Test2{
	void show();
}

interface Test2{
	void myMethod();
}

