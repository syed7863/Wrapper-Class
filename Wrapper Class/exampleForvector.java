package syed;

import java.util.Vector;

public class exampleForvector {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add(10.5);
		v.add("Java");
		
		for(Object o :v)
		{
			System.out.println(v);
		}

	}

}
