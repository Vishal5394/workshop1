package javabasic;

public class addition {

	public static void main(String[] args) {
		
			 int num = 35 ;
			 int Sum = 0 ;
			 while (num > 0) {
				 Sum =Sum + num % 10 ;
				 num = num / 10;
			 }
			 System.out.println(Sum);
		 }

	}

