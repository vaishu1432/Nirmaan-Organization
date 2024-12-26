package day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class ArrayListex {
	public static void main(String[] args) {
		ArrayList al2 = new ArrayList();
		al2.add(50);
		al2.add(60);
		al2.add(70);

		ArrayList al = new ArrayList();
		al.add(30);
		al.add(20);
		al.add(10);
		al.add(40);
		al.addAll(al2);
		System.out.println(al2.getFirst());
		//System.out.println(al.addAll(al));
		System.out.println("Before sort"+al);
		Collections.sort(al);
		System.out.println("After sort"+al);
		Collections.sort(al);
		System.out.println("Assending sort"+al);
		Collections.sort(al);
		System.out.println("Desending sort"+al);
		Collections.sort(al,Comparator.reverseOrder());
		System.out.println(al);
		al.addFirst(al);

		
			
		
	}

}
	


