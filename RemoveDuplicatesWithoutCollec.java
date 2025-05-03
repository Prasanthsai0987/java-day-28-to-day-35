package day32;

import java.util.Arrays;
import java.util.*;
public class RemoveDuplicatesWithoutCollec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] a=new int[size];
		
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();

		}
		
		Arrays.sort(a);
		

        // Removing duplicates in-place
        int j = 0;  // Pointer for unique elements
        for (int i = 0; i < size - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }
        a[j++] = a[size - 1];  // Add last unique element

        // Print the unique elements
        for (int i = 0; i < j; i++) {
            System.out.print(a[i] + " ");
        }
		
	}

}
