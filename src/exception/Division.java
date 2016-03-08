package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Division {
	static int result =0;
	public static void main(String[] args) {

		int a, b, result = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Input two integers");

		a = input.nextInt();
		b = input.nextInt();

		try
		{
			result = a / b;
			//catch the most specific exception first	
		}catch (ArithmeticException e)
		{
			System.out.println("invalid number!");
			System.out.println("enter valid number");
			b = input.nextInt();
			result = a / b;
			//an IO exception is more general... maybe the drive is corrupt
		}


		finally {
			System.out.println("Result = " + result);
		}



	}
}


