package bj2;
import bj1.*;

public class Test {

	public static void main(String[] args) {
		Daughter daughter = new Daughter();
		daughter.name="Lily";
		//daughter.age = 15; age is a private field	
		
		bj1.Father afather= new bj1.Father();
		//Ÿ��Ű���� Ŭ�󽺸� ����Ϸ���
		//1. ��Ű����.Ŭ�󽺸�
		Father bfather= new Father();
		afather.name="happy";
		//afather.ID="12412";
		//2. import ��ɾ ���
		//afather.nickname="a	a"; nickname�� ��Ű�� ��������
		
		Mother mm = new Mother();
		

	}

}
