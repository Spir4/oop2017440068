package bj;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//Dog dog = new Dog();
		//dog.sing();
		//�߻� Ŭ���� ��ü�� ���� �� ����.
		//aaa.sing();
		//dog.eat();
		//error aaa.eat();
		//�캯�� Ŭ�󽺰� �º� Ŭ���� subclass �̸� ���� ���� ����.
		//Upcasting
	    Animal aaa = new Dog();
		//overiding �� �޼ҵ带 ȣ���ϸ� subclass�� �޼ҵ尡 �����Ѵ�.
		aaa.sing();
		aaa = new Cat();
		aaa.sing();
		//������(polymorphism)
		//1. �ϳ��� Ŭ�󽺷κ��� ���� ���� Ŭ�󽺸� ���� ���
		//2. ��� ����Ŭ�󽺴� ����Ŭ���� �޼ҵ带 override�Ѵ�.
		//3. superClass SuperRefVar= new SubClass();
		//4. superRefVar.overMethod() -> ��ü�� Ŭ�󽺰� ������ �޼ҵ带 �����Ѵ�.
		Scanner ss= new Scanner(System.in);
		String str =ss.next();
		if (str.equals("dog"))aaa = new Dog();
		else aaa = new Cat();
		aaa.sing();//���� ���ε�(Dynamic Binding): ���α׷� ���� �� ȣ���� �޼ҵ带 �����Ѵ�.
		
		int a;
		a=(int) 3.1;//����ȯ(type casting)
		
	
		
	}

}
