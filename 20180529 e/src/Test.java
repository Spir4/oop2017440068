
public class Test {

	public static void main(String[] args) {
		String str = new String("Hello");
		Box box = new Box();
		System.out.println("the box contains "+box.get());
		
		box.set(str);
		String str1= "Mr."+box.get();
		int a=10;
		box.set(a);//autoboxing
		System.out.println(box.get());
		

	}

}
