package bj;

public class Dog extends Animal {
	public Dog() {//����Ʈ ������
		//����� ����Ŭ���� ������ ȣ�� super();
		super(3);
		System.out.println("Dog ����Ʈ ������");
	}
	public Dog(int a) {
		//����� ����Ŭ���� ������ super();
		
		System.out.println("Dog ������ ������");
	}
}
