package coding_test_preperation;

import java.util.HashMap;
import java.util.Iterator;


public class _20200302_hashmap_spy {

	public static void main(String[] args) {
		String[][] clothes = new String[][] {{"yellow_hat","headgear"},{"blue_sunglasses","eyewear" },{"green_turban","headgear" }};

        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<clothes.length; i++){
            String key = clothes[i][1];
            if(!map.containsKey(key)) { //containsKey 메소드에 키값을 넘겨주면 해당 키값이 HashMap에 있을경우 true를 없을 경우 false를 넘겨 줍니다.
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        System.out.println("debugging1") ;
        map.forEach((key, value) -> {
        	  System.out.print("key: "+ key);
        	  System.out.println(", Value: "+ value);
        });	    
        
        int sum = 0;
        int multi = 1;
        int tmp = 0;
        
        System.out.println("debugging2") ;

        // way 1
        for ( String key : map.keySet() ) {
            sum = sum + map.get(key);
            multi = multi *  map.get(key);
        }
        System.out.println(sum + multi);
        
        // way 2
        Iterator<Integer> it = map.values().iterator();
        while(it.hasNext()) {
            answer *= it.next().intValue()+1;
        }
        System.out.println(answer-1);
	}

}
