
public class String {

	public String(java.lang.String string) {

	}

	public static void main(java.lang.String[] args) {

		String str1= new String("Hello");
		String str2= new String("Hello");
		str1.equals(str2);
		boolean a= str1==str2;
		System.out.println(a);
	}

}
