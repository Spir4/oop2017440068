
public class TestAnimalSing {

	public static void main(String[] args) {
		AnimalSing as = new AnimalSing();
		as.add(new Dog("Tina"));
		as.add(new Dog("해피"));
		as.add(new Dog("민트"));
		as.add(new Dog("또리"));
		as.add(new Cat("누루"));
		as.add(new Cat("건공이"));
		as.add(new Cat("인문이"));
		as.add(new Cat("나비"));
		
		as.sing();
		
			
	}

}
