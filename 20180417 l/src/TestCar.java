
public class TestCar {

	public static void main(String[] args) {
		System.out.println(Math.cos(0));//Math.cos() ��ü�� �������� �ʰ� ����� �� �ִ� �޼ҵ�
		Car myCar = new Car("Space Blue",300);
		System.out.println(myCar);
		System.out.println(myCar.numberOfCars);
		Car yourCar= new Car();
		
	//	myCar.setColor("Black");
	//	myCar.setSpeed(110);
		System.out.println(yourCar);
		System.out.println(yourCar.numberOfCars);
		System.out.println(Car.numberOfCars);
		Car.print();
		//���� ������ "Ŭ�󽺸�, ����������"���ε� ������ �� �ִ�.
	}

}
