import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		//Map<String,String> map = new TreeMap<>();
		//Map<String,String> map = new LinkedHashMap<>();
		//추가: .put(key,value) value 찾기  .get(key)
		map.put("재인","청와대");
		map.put("트럼프","백악관");
		map.put("정은","평양");
		
		System.out.println(map.get("재인"));
		
		//훑는 방법 1: iterator 사용
		//Iterator<String> itr = map.keySet().iterator();
		Set<String> set = map.keySet();//map.set(): map에 저장된 엔트리(키,값) 중 키만 모은 셋
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println(String.format("이름: %s, 사는 곳: %s", key, map.get(key)));
		}
		
		//훑는 방법 2: 키셋을 만들어 for() 반복문 이용
		for(String key : map.keySet()) {
			System.out.println(String.format("이름: %s, 사는 곳: %s", key, map.get(key)));
		}
		
		//훑는 방법 3:
		for(Map.Entry<String,String> key : map.entrySet()) {
			System.out.println(String.format("이름: %s, 사는 곳: %s", key.getKey(),key.getValue()));
		}

	}

}
