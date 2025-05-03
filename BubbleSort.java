package day32;

import java.util.*;

import java.util.Scanner;

public class BubbleSort {

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
		
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		System.out.println("after sorting");
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+ " ");
		}

	}

}
