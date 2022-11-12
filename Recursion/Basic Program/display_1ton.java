// Write a Recursive Function program to print 1 to n numbers,number entered by the UnsupportedOperationException

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

	    //Recursive call
	    display(num-1);
	    System.out.println(num);
	}
}
