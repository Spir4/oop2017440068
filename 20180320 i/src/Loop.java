
public class Loop {

	public static void main(String[] args) {
		//1~10 정수를 화면에 출력
		int i;//i는 루프변수
		i=1;//1. 루프변수 초기화
		while(i<11) {//2. 루프 조건식
			System.out.println("i="+i);	//3. 루프문
			i++;//4. 루프변수 변화
		}

		int sum=0;
		i=1;
		while (i<=10) {
			sum=sum+i;
			i++;
		}
		System.out.println("Sum="+sum);
		
		String str = "hello darkness my old friend";
		int count=0;
		for(i=0; i<str.length(); i++) {
			if(str.charAt(i) !='l')
				continue;
			count++;
		}
		System.out.println("문장에서 발견한 l의 개수"+count);
		System.out.println("=============프로그램 종료");
	}

}
