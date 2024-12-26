package syed;

public class ExampleForBoxing {

	public static void main(String[] args) {
		//primitive way of representing 10
		int num=10;
		
		//Non-primitive way of representing 10
		Integer num1=new Integer(10);
		
		//Autoboxing
		
		int i=5;
		Integer j = new Integer(i);
		System.out.println(i+ " "+ j);
		
		//auto-unboxing
		
		Integer c = new Integer(50);
		int d=c;
		System.out.println( c +" " + d);

	}

}
