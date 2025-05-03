package day32;

import java.util.*;
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("size");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();	
		}
		
		System.out.println("before sorting");
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+ " ");
		}
		
		for(int i=1;i<size;i++) {
			int k=a[i];
			int j=i-1;
			
			while(i>=0 && a[j]>k )
			{
				a[j+1]=a[j];      //shifting the elements
				
				j--;     //5 5 10 8 1
			}
			a[j+1]=k;
			
		}
		System.out.println("after sorting");
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
