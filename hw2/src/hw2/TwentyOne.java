package hw2;

import java.util.Scanner;

public class TwentyOne {

	public static void main(String[] args) {
		// 사용자로부터 한 숫자를 입력받아, 입력받은 숫자 이하의 소수들의 합을 구하는 프로그램을 작성하시오.
		int a;
		int sum = 0;
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		a=input.nextInt();

		for(int i = 2; i < a ; i++) {

			for(int j = 1; j <= i; j++) {

				if(i % j == 0) {
					count++;
				}

			}
			if(count==2) {
				sum=sum+i;
			}
			count=0;

		}
		System.out.println(sum);

	}
}


