package hw1;

import java.util.Scanner;

public class ConditionalFour {

	public static void main(String[] args) {
		// 4. 점수(정수)를 입력 받아서 등급(A, B, C, D, E)을 출력하는 프로그램을 작성하시오.
		//(A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)
		int a;

		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하시오: ");
		a=input.nextInt();

		if(a>100||a<0) {
			System.out.println("다시 입력해주세요.");
		}
		else if(a>=80) {
			System.out.println("A등급 입니다.");
		}
		else if(a>=60) {
			System.out.println("B등급 입니다.");
		}
		else if (a>=40) {
			System.out.println("C등급 입니다.");
		}
		else if (a>=20) {
			System.out.println("D등급 입니다.");
		}
		else  {
			System.out.println("E등급 입니다.");
		}
		System.out.println("========프로그램 종료");
			

	}
}
