package bj;

public class Dog extends Animal {
	public Dog() {//����Ʈ ������
		//����� ����Ŭ���� ������ ȣ�� super();
		System.out.println("Dog ����Ʈ ������");
	}
	public Dog(int a) {
		//����� ����Ŭ���� ������ super();
		super(a);
		System.out.println("Dog ������ ������");
	}
}
