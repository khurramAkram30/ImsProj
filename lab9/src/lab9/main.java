package lab9;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		try{
		
		int a[] = new int[10];
		for(int i=0; i<10;i++ ) {
		int b = (int)(Math.random()*(10));
		a[i]=b;
		
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.print("Enter Index");
		int userInput=sc.nextInt();
		System.out.print(a[userInput]);
		}
			 catch(ArrayIndexOutOfBoundsException e){
			 System.out.println ("Array Index is Out Of Bounds");
			 }

	}

}
