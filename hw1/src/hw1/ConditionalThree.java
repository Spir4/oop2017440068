package hw1;

import java.util.Scanner;

public class ConditionalThree {

	public static void main(String[] args) {
		// 3. 세 수(정수형)를 입력 받아 가장 큰 수를 출력하는 프로그램을 작성하시오.
		int a,b,c;

		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하시오: ");
		a=input.nextInt();
		System.out.print("두번째 정수를 입력하시오: ");
		b=input.nextInt();
		System.out.print("세번째 정수를 입력하시오: ");
		c=input.nextInt();
		
		if(a>=b) {
			if(a>=c) {
				System.out.println("가장 큰수 a=" +a +"입니다.");
			}
			else
				System.out.println("가장 큰수 c="+c+"입니다");
		}
		else if(b>=c) {
			System.out.println("가장 큰수 b="+b+"입니다");
		}
		else {
			System.out.println("가장 큰수 c="+c+"입니다");
		}
		System.out.println("========프로그램 종료");
	}

}
