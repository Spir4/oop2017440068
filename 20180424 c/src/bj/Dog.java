package bj;

public class Dog extends Animal {
	public Dog() {//디폴트 생성자
		//명시적 슈퍼클라스의 생성자 호출 super();
		super(3);
		System.out.println("Dog 디폴트 생성자");
	}
	public Dog(int a) {
		//명시적 슈퍼클라스의 생성자 super();
		
		System.out.println("Dog 정수형 생성자");
	}
}
