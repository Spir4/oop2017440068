package hw2;

import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		//소수(prime-number) 검사와 흡사하게 사용자가 입력한 수의 인수들을 모두 출력하는 프로그램을 작성하시오.
		//8 => 2 4 		12 => 2 3 4 6
		//0을 입력하기 전까지는 계속 수행(인수 출력)하도록 수정하시오.
		while(true) {

			int a;
			Scanner input = new Scanner(System.in);
			System.out.print("정수를 입력하시오: ");
			a=input.nextInt();
			if(a==0) {
				System.out.println("========프로그램 종료");
				break;
			}
			else if(a<=1) {
				System.out.println("다시 입력해주세요.");
			}
			else {
				for(int i=2;i<a;i++) {
					if(a%i==0)
						System.out.println(i);
				}
			}
		}

	}
}