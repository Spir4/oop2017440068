package hw1;

import java.util.Scanner;

public class ConditionalFive {

	public static void main(String[] args) {
		// �޴��� ����ϰ�, ����ڷκ��� �Է��� �޾� ���õ� �޴��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		System.out.println("-Menu-f");
		System.out.println("orange");
		System.out.println("apple");
		System.out.println("banana");
		System.out.println("peach");
		String menu[] = {"orange","apple","banana","peach"};
		Scanner input = new Scanner(System.in);
		System.out.print("choose one of the following: ");
		String s=input.next();
		if(s.equals("orange"))
			System.out.println("Your choice is orange");
		else if(s.equals("apple"))
			System.out.println("Your choice isapple");
		else if(s.equals("banana"))
			System.out.println("Your choice is banana");
		else if(s.equals("peach"))
			System.out.println("Your choice is peach");
		else
			System.out.println("we don't have such menu");
		
		System.out.println("=========program end");
		


	}

}
