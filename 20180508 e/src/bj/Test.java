package bj;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//Dog dog = new Dog();
		//dog.sing();
		//추상 클라스의 객체는 만들 수 없다.
		//aaa.sing();
		//dog.eat();
		//error aaa.eat();
		//우변의 클라스가 좌변 클라스의 subclass 이면 전혀 문제 없다.
		//Upcasting
	    Animal aaa = new Dog();
		//overiding 한 메소드를 호출하면 subclass의 메소드가 수행한다.
		aaa.sing();
		aaa = new Cat();
		aaa.sing();
		//다형성(polymorphism)
		//1. 하나의 클라스로부터 여러 서브 클라스를 만들 경우
		//2. 모든 서브클라스는 슈퍼클라스의 메소드를 override한다.
		//3. superClass SuperRefVar= new SubClass();
		//4. superRefVar.overMethod() -> 객체의 클라스가 구현한 메소드를 실행한다.
		Scanner ss= new Scanner(System.in);
		String str =ss.next();
		if (str.equals("dog"))aaa = new Dog();
		else aaa = new Cat();
		aaa.sing();//동적 바인딩(Dynamic Binding): 프로그램 수행 시 호출할 메소드를 결정한다.
		
		int a;
		a=(int) 3.1;//형변환(type casting)
		
	
		
	}

}
