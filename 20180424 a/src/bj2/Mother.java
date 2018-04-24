package bj2;

public class Mother extends bj1.Man { 
	void print() {
		System.out.println(publicField);
	//	System.out.println(privateField);
	//	System.out.println(packageField);
		System.out.println(protectedField);
	}
	public Mother() {
		protectedField = "test";
	}
}
