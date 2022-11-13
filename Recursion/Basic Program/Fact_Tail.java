// Write a Recursive Function program to print Factorial of a number entered by the User Using Tail Recursion

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); // to take a number from the user
		System.out.println(Factorial(num,1));
	}
	
	public static int Factorial(int num,int ans){
	    // Base case 
	    if(num==0){
	        return ans;
	    }
	    //Recursive call
	    return Factorial(num-1,ans*num);
	       
	}
}
