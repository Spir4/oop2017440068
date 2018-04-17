
public class TestCar {

	public static void main(String[] args) {
		System.out.println(Math.cos(0));//Math.cos() 객체를 생성하지 않고 사용할 수 있는 메소드
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
		//정적 변수는 "클라스명, 정적변수명"으로도 접근할 수 있다.
	}

}
