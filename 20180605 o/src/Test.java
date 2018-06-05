
public class Test {

	public static void main(String[] args) {
		Animal aDog = new Dog("Tina");
		Animal aCat = new Cat("Tom");//upcasting
		aDog.sing();
	    aCat.sing();
	   //error aDog.playFetch();
	   ((Dog) aDog).playFetch();//downcasting
	   //error ((Cat) aDog).playFetch();
	   //runtime error((Dog) aCat).playFetch();
	}

}
