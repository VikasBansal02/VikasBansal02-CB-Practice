// Write a Recursive Function program to find Nth Fibonacci Number N entered by the User

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); // Nth term of Fibonacci
		System.out.println(Nth_Fibonacci(N));
	}
	
	public static int Nth_Fibonacci(int N){
	    // Base case 
	    if(N==0 || N==1){
	        return N;
	    }
	    
	    //Recursive call
	    int f1 = Nth_Fibonacci(N-1);
	    int f2 = Nth_Fibonacci(N-2);
	    
	    return f1+f2;
	}
}
