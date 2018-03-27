package hw1;

import java.util.Scanner;

public class ConditionalSix {

	public static void main(String[] args) {
		// 어떤 두 자리 수의 자릿수의 순서를 서로 바꾸는 프로그램을 작성하시오.
		int a;
		int ten,one;
		Scanner input = new Scanner(System.in);
		System.out.print("두자리 수 정수를 입력하시오: ");
		a=input.nextInt();

		if(a>=10&&a<100) {
			ten=a/10;
			one=a-10*ten;
			a=10*one+ten;
			System.out.println(a);
		}
		else
			System.out.println("두자리 수 정수가 아닙니다.");
		
		System.out.println("========프로그램 종료");
	}
}
