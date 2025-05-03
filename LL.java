package day28;

import java.util.*;
public class LL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<>();
		a.add("h");
		
		LinkedList<String> l=new LinkedList<>();
		
		l.add("d");
		l.addAll(a);
		l.remove(1);
		System.out.println(l);
	}

}
