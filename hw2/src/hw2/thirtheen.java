package hw2;

import java.util.Scanner;

public class thirtheen {

	public static void main(String[] args) {
		// month와 day를 입력 받아, 1월 1일부터의 총 day수를 출력하는 프로그램을 작성하시오. (switch문 사용) 
		//1월 20일은 20일 출력, 2월 5일은 36일 출력. 단 2월은 28일로 계산.
		int a,b,days;
		Scanner input = new Scanner(System.in);
		System.out.print("month를 입력하시오: ");
		a=input.nextInt();
		System.out.print("day를 입력하시오: ");
		b=input.nextInt();
		

		switch(a) {
		case 1:
			days=b;
			System.out.println(days+"일입니다");
			break;
		case 2:
			days=31+b;
			System.out.println(days+"일입니다");
			break;
		case 3:
			days=31+28+b;
			System.out.println(days+"일입니다");
			break;
		case 4:
			days=31+28+31+b;
			System.out.println(days+"일입니다");
			break;
		case 5:
			days=31+28+31+30+b;
			System.out.println(days+"일입니다");
			break;
		case 6:
			days=31+28+31+30+31+b;
			System.out.println(days+"일입니다");
			break;
		case 7:
			days=31+28+31+30+31+30+b;
			System.out.println(days+"일입니다");
			break;
		case 8:
			days=31+28+31+30+31+30+31+b;
			System.out.println(days+"일입니다");
			break;
		case 9:
			days=31+28+31+30+31+30+31+31+b;
			System.out.println(days+"일입니다");
			break;
		case 10:
			days=31+28+31+30+31+30+31+31+30+b;
			System.out.println(days+"일입니다");
			break;
		case 11:
			days=31+28+31+30+31+30+31+31+30+31+b;
			System.out.println(days+"일입니다");
			break;
		case 12:
			days=31+28+31+30+31+30+31+31+30+31+30+b;
			System.out.println(days+"일입니다");
			break;
		}
		System.out.println("========프로그램 종료");
	}
}