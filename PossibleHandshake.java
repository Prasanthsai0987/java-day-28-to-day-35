package day32;

import java.util.*;
public class PossibleHandshake {
	
	static int handShake(int n) {
		
		return n*(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		
		System.out.print(handShake(n));
		

	}

}
