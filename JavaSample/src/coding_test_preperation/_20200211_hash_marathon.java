/**
HashMap<Integer, String> map = new HashMap<Integer, String>();
// ���ִ� ���
map.put(1, "����");
map.put(2, "����");
map.put(3, "���");
// map.put(4.0, "����"); // ������ ����
System.out.println(map);
// ���
{1=����, 2=����, 3=���}



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
	        	hm.put(player, hm.getOrDefault(player, 0) + 1);	//hm A �� ���� �ֳ� >> ������ 0�� �־��. �״����� 1�� ���ض�. �װŸ� A�� �־��. 
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
	            if (hm.get(key) != 0){ // key�� �ش�Ǵ� value�� 0�� �ƴϸ� �̿�����!
	                answer = key;
	            }
	        }
	        System.out.println(answer) ;
		}
}
