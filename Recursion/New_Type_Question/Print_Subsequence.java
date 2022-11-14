// Write a Recursive Function program to Subsequence of a String entered by the User

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String Str = scan.next(); // Enter a String to find it's Subsequence
		Print_Sub_Seq(Str,"");
	}
	
	public static void Print_Sub_Seq(String ques, String ans){
	    // Base case 
	    if(ques.length()==0){
	        System.out.println(ans);
	        return;
	    }
	    
	    char ch = ques.charAt(0); // character at 0 index
	    
	    //Recursive call
	    Print_Sub_Seq(ques.substring(1),ans);
	    Print_Sub_Seq(ques.subtring(1),ans+ch);
	}
}
