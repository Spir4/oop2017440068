package hw2;

public class Three {

	public static void main(String[] args) {
		// 1부터 100사이의 숫자(정수) 중에서 3의 공배수(3,6,9,12,..)들의 총합을 출력하는 프로그램을 작성하시오.(while문 사용)
		int a=1,sum=0;
		while(a<=100) {
			if(a%3==0) {
				sum=sum+a;
			}
			a++;
		}
		System.out.println("총합은 "+sum+"입니다");
		
		System.out.println("========프로그램 종료");

	}

}
