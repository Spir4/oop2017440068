package bj;

public class Dog extends Animal implements Playable{
	
	
	
	@Override
	void sing() {
		System.out.println("A dog dark");
	}
	void eat() {
		System.out.println("A dog eats");
	}
	@Override
	public void walk() {
		System.out.println("walk with a dog");
		
	}
	@Override
	public void fetch() {
		System.out.println("Fetch with a dog");
		
	}

}
