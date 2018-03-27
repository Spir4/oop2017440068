package hw1;

import java.util.Scanner;

public class ConditionalOne {

	public static void main(String[] args) {
		//1. 두 수(정수)를 입력 받아, 그 중 큰 수를 출력하는 프로그램을 작성하시오.
		int a,b;
		
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하시오: ");
		a=input.nextInt();
		System.out.print("두번째 정수를 입력하시오: ");
		b=input.nextInt();
		
		if(a>b)
			System.out.println("a="+a+"가 큽니다");
		else
			System.out.println("b="+b+"가 큽니다");
		
		System.out.println("========프로그램 종료");
		
		

	}

}
