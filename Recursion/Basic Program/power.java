// Write a Recursive Function program to print a to the power b entered by the UnsupportedOperationException

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt(); // Value of a
		int num2 = scan.nextInt(); // Value of b
		System.out.println(Power(num1,num2));
	}
	
	public static int Power(int num1, int num2){
	    // Base case 
	   // Case 1 
	   // if(num2==0){
	   //     return 1;
	   // }
	   
	   // Case 2
	   if (num2==1){
	       return num1;
	   }
	    //Recursive call
	    return num1 * Power(num1,num2-1);
	       
	}
}
