package hw1;

import java.util.Scanner;

public class ConditionalSix {

	public static void main(String[] args) {
		// � �� �ڸ� ���� �ڸ����� ������ ���� �ٲٴ� ���α׷��� �ۼ��Ͻÿ�.
		int a;
		int ten,one;
		Scanner input = new Scanner(System.in);
		System.out.print("���ڸ� �� ������ �Է��Ͻÿ�: ");
		a=input.nextInt();

		if(a>=10&&a<100) {
			ten=a/10;
			one=a-10*ten;
			a=10*one+ten;
			System.out.println(a);
		}
		else
			System.out.println("���ڸ� �� ������ �ƴմϴ�.");
		
		System.out.println("========���α׷� ����");
	}
}
