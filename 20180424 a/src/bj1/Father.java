package bj1;

public class Father extends Man {
	public String name;
	private String ID;
	String nickname; //package ����������: ��Ű�� �������� public
	void print() {
		System.out.println(publicField);
	//	System.out.println(privateField);
		System.out.println(packageField);
		System.out.println(protectedField);
		
	}
}
