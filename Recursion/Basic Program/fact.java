// Write a Recursive Function program to print Factorial of a number entered by the UnsupportedOperationException

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); // to take a number from the user
		System.out.println(Factorial(num));
	}
	
	public static int Factorial(int num){
	    // Base case 
	    if(num==0){
	        return 1;
	    }
	    //Recursive call
	    return num * Factorial(num-1);
	       
	}
}
