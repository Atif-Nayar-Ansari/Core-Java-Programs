package com.array.allnewloops;

import java.util.ArrayList;

public class AllTheLoopsInProgram {

	public static void main(String[] args) {

		//all the three loops
		int[] a = {1, 2, 3, 4, 5, 6};
		
		//using traditional method
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}//
		
		
		
		System.out.println();
		//using enhanced for loop or for-in loop
		for(int x : a) {
			System.out.print(x+" ");
		}
		
		
		System.out.println();
		
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("a");
		arraylist.add("b");
		arraylist.add("c");
		//using ebhanced for loop
		for(String s : arraylist) {
			System.out.print(s+" ");
		}
		
		
	}

}
