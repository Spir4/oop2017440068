package bj2;
import bj1.*;

public class Test {

	public static void main(String[] args) {
		Daughter daughter = new Daughter();
		daughter.name="Lily";
		//daughter.age = 15; age is a private field	
		
		bj1.Father afather= new bj1.Father();
		//타패키지의 클라스를 사용하려면
		//1. 패키지명.클라스명
		Father bfather= new Father();
		afather.name="happy";
		//afather.ID="12412";
		//2. import 명령어를 사용
		//afather.nickname="a	a"; nickname은 패키지 접근지정
		
		Mother mm = new Mother();
		

	}

}
