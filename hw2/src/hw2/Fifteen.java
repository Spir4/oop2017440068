package hw2;

import java.util.Random;
import java.util.Scanner;

public class Fifteen {

	public static void main(String[] args) {
		// 1~100 사이의 숫자 하나를 정한 뒤(랜덤으로 생성해도 됨), 10번 이내로 그 숫자를 맞추는 게임을 작성하시오.
		Random Random = new Random();
		int i = Random.nextInt(101)+1;
		int b=1;

		while(b<=10) {
			int a;
			Scanner input = new Scanner(System.in);
			System.out.print("수: ");
			a=input.nextInt();
			if(a==i) {
				System.out.println("정답입니다.");
				break;
			}
			else if(a>i) {
				System.out.println("입력한 숫자보다 작습니다.");
				b++;
			}
			else
				System.out.println("입력한 숫자보다 큽니다.");
			b++;
		}
		System.out.println("Game over");
		System.out.println("========프로그램 종료");


	}

}
