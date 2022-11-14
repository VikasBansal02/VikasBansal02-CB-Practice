// Write a Recursive Function program to print and Count Subsequence of a String entered by the User

import java.util.*;
public class Main
{
    //First Way
    // static int count = 0;
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String Str = scan.next(); // Enter a String to find it's Subsequence
		
// 		First Way

// 		Print_Sub_Seq(Str,"");
// 		System.out.println(count);

        // Second Way
        
        System.out.println(Print_Sub_Seq(Str,""));
	}
	
	// First Way
// 	public static void Print_Sub_Seq(String ques, String ans){
// 	    // Base case 
// 	    if(ques.length()==0){
// 	        System.out.println(ans);
// 	        count++;
// 	        return;
// 	    }
	    
// 	    char ch = ques.charAt(0); // character at 0 index
	    
// 	    //Recursive call
// 	    Print_Sub_Seq(ques.substring(1),ans);
// 	    Print_Sub_Seq(ques.substring(1),ans+ch);
// 	}

    // Second Way
    
    public static int Print_Sub_Seq(String ques, String ans){
	    // Base case 
	    if(ques.length()==0){
	        System.out.println(ans);
	        return 1;
	    }
	    
	    char ch = ques.charAt(0); // character at 0 index
	    
	    //Recursive call
	    int f1 = Print_Sub_Seq(ques.substring(1),ans);
	    int f2 = Print_Sub_Seq(ques.substring(1),ans+ch);
	    return f1 + f2;
	}
}
