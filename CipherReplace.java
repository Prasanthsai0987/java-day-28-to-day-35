package day31;
import java.util.*;

public class CipherReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		
		//String s=sc.next();
		
		//String x=new StringBuilder().toString();
		System.out.print("output for the a to z : ");
		String c1="";
		
		for(char s1='a';s1<='z';s1++) {
			c1+=s1;
		}
		
		
		for(char c:c1.toCharArray()) {
			char p=(char) ((c-'a'+10)%26+'a');
			System.out.print(p);
		}

	}

}
