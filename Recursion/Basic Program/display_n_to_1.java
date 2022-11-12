// Write a Recursive Function program to print n to 1 numbers,number entered by the UnsupportedOperationException

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		display(num);
	}
	
	public static void display(int num){
	    // Base case 
	   if (num==0){
	       return;
	   }
	   System.out.println(num);
	    //Recursive call
	   display(num-1);
	       
	}
}
