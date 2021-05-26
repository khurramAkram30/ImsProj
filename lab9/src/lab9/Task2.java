package lab9;
import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	try {
		Scanner sc=new Scanner(System.in);
		int first,second;
		System.out.println("Division Game");
		System.out.println("Enter first digit: ");
        first = sc.nextInt();
        System.out.println("Enter second digit: ");
        second = sc.nextInt();
        if (second == 0) {
             throw new ArithmeticException("Zero Should not be entered.");
         }
        System.out.println("Answer:"+first/second);
     } 
	catch (InputMismatchException e) {
        System.out.println("Only integer number entered.");
     }
		
	}
	}

