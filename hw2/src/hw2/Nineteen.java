package hw2;

import java.util.Scanner;

public class Nineteen {

	public static void main(String[] args) {
		// 사용자로부터 한 숫자를 입력받아, 입력받은 숫자가 소수인지 아닌지를 검사하는 프로그램을 작성하시오.
		int a;
		boolean isPrime = false;
		Scanner input = new Scanner(System.in);
		System.out.print("수: ");
		a=input.nextInt();
		for(int b=2;b<a;b++) {
			if(a%b==0) {
				isPrime=true;
				break;
			}


		}
		if(isPrime) {
			System.out.println(a+" 은 소수가 아닙니다.");
		}
		else
			System.out.println(a+" 은 소수입니다.");

	}
}
