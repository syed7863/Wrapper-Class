package syed;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenericsDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("python");
		al.add("JavaScript");
		for(String s:al) 
		{
			System.out.println(s);
		
		}
		System.out.println("============");
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		for(int i:ll)
		{
			System.out.println(ll);
		}
	}

}
