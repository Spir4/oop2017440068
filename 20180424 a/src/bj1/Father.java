package bj1;

public class Father extends Man {
	public String name;
	private String ID;
	String nickname; //package 접근지저어: 패키지 내에서만 public
	void print() {
		System.out.println(publicField);
	//	System.out.println(privateField);
		System.out.println(packageField);
		System.out.println(protectedField);
		
	}
}
