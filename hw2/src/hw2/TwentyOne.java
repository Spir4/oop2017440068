package hw2;

import java.util.Scanner;

public class TwentyOne {

	public static void main(String[] args) {
		// ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���� ������ �Ҽ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a;
		int sum = 0;
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
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


