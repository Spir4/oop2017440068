import java.util.*;

public class TestQueue {
	public static void main(String[] args) {
		//Queue<String> strs = new LinkedList<String>();
		Queue<String> strs = new PriorityQueue<>();
		strs.add("trump");
		strs.add("jungeun");
		System.out.println(strs);
		strs.add("jaein");
		strs.add("joonpyo");
		System.out.println(strs);
		
		while (!strs.isEmpty()) {//for (���Ÿ�� ��������: �ݷ��Ǻ���)
			String str2;
			str2 = strs.remove();
			System.out.println(str2);
			System.out.println(strs);
		}
		System.out.println(strs);
	}
	
	
}
