/**
HashMap<Integer, String> map = new HashMap<Integer, String>();
// 값넣는 방법
map.put(1, "감자");
map.put(2, "배추");
map.put(3, "사과");
// map.put(4.0, "고구마"); // 컴파일 에러
System.out.println(map);
// 출력
{1=감자, 2=배추, 3=사과}



**/
package coding_test_preperation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _20200211_hash_marathon {	 
	 
		public static void main(String[] args) {
			String answer = "";
	        HashMap<String, Integer> hm = new HashMap<>();

	        String[] participant = new String[] { "A","B","C","D" };
	        String[] completion = new String[] { "A","B","C" };
	        
	        for (String player : participant) {
	        	hm.put(player, hm.getOrDefault(player, 0) + 1);	//hm A 에 값이 있냐 >> 없으면 0을 넣어라. 그다음에 1을 더해라. 그거를 A에 넣어라. 
	        }       

	        System.out.println("debugging1") ;
	        hm.forEach((key, value) -> {
	        	  System.out.print("key: "+ key);
	        	  System.out.println(", Value: "+ value);
	        });	        
	        for (String player : completion) {
	        	hm.put(player, hm.get(player) - 1);
	        } 		
	        System.out.println("debugging2") ;
	        hm.forEach((key, value) -> {
	        	  System.out.print("key: "+ key);
	        	  System.out.println(", Value: "+ value);
        	});
	        
	        for (String key : hm.keySet()) {
	            if (hm.get(key) != 0){ // key에 해당되는 value가 0이 아니면 미완주자!
	                answer = key;
	            }
	        }
	        System.out.println(answer) ;
		}
}
