package testNgLearn;

public class StringLearn {
	
	
	public static String stringConcat(String concatValue)
	{
		
		String s="wanted to append new "+concatValue;
		
		
		return s;
	}
	
	

	public static void main(String[] args) {

		String ss=stringConcat("this is another value");
		System.out.println(ss);
	}

}
