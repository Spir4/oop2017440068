package hw2;

public class Five {

	public static void main(String[] args) {
		// 1���� 100������ ����(����) �߿��� 3�� �����(3,6,9,12,..)���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(do-while�� ���)
		//do while���� ����� �ʾ� for������ ��ü
		int sum=0;
		for(int a=1;a<=100;a++) {
			if(a%3==0) {
				sum=sum+a;
			}
		}
		System.out.println("������ "+sum+"�Դϴ�");

		System.out.println("========���α׷� ����");
	}

}
