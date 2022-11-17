package forLoop;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=2;i<=10;i+=2) {
			System.out.println(i);
			
		}
		System.out.println("For loop bitti");
		
		int i=0;
		while(i<100) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While loop bitti");
		
		int j=0;
		do{
			System.out.println("loglandi");
			System.out.println(j);
			j++;
		}while(j<10);
		System.out.println("do-While loop bitti");

	}

}
