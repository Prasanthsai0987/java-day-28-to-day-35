package day31;

import java.util.*;

public class FreqOccur { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        
        HashMap<Character, Integer> h = new HashMap<>();
        
        for (char ch : s.toCharArray()) {
        	
            if(h.containsKey(ch)) {
            	int count = h.get(ch);
            	h.put(ch,count+1);
            }
            else {
            	h.put(ch,1);
            }
        }

        StringBuilder result = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : h.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        System.out.println(result.toString());
    }
}
