import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		//Map<String,String> map = new TreeMap<>();
		//Map<String,String> map = new LinkedHashMap<>();
		//�߰�: .put(key,value) value ã��  .get(key)
		map.put("����","û�ʹ�");
		map.put("Ʈ����","��ǰ�");
		map.put("����","���");
		
		System.out.println(map.get("����"));
		
		//�ȴ� ��� 1: iterator ���
		//Iterator<String> itr = map.keySet().iterator();
		Set<String> set = map.keySet();//map.set(): map�� ����� ��Ʈ��(Ű,��) �� Ű�� ���� ��
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println(String.format("�̸�: %s, ��� ��: %s", key, map.get(key)));
		}
		
		//�ȴ� ��� 2: Ű���� ����� for() �ݺ��� �̿�
		for(String key : map.keySet()) {
			System.out.println(String.format("�̸�: %s, ��� ��: %s", key, map.get(key)));
		}
		
		//�ȴ� ��� 3:
		for(Map.Entry<String,String> key : map.entrySet()) {
			System.out.println(String.format("�̸�: %s, ��� ��: %s", key.getKey(),key.getValue()));
		}

	}

}
