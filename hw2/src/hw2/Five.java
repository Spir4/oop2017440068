package hw2;

public class Five {

	public static void main(String[] args) {
		// 1부터 100사이의 숫자(정수) 중에서 3의 공배수(3,6,9,12,..)들의 총합을 출력하는 프로그램을 작성하시오.(do-while문 사용)
		//do while문을 배우지 않아 for문으로 대체
		int sum=0;
		for(int a=1;a<=100;a++) {
			if(a%3==0) {
				sum=sum+a;
			}
		}
		System.out.println("총합은 "+sum+"입니다");

		System.out.println("========프로그램 종료");
	}

}
