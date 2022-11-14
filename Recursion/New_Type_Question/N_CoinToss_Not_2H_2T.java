// Write a Recursive Function program to Print N CoinToss Simultatously and Without 2 Consecutive Heads and Without 2 Tails, N entered by the User

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); // Number of Coins
		N_CoinToss_Not_2H_2T(N,"");
	}
	
	public static void N_CoinToss_Not_2H_2T(int n, String ans){
	    // Base case 
	    if(n==0){
	        System.out.print(ans+" ");
	        return;
	    }
	    
	    //Recursive call
	    
	    if(ans.length()==0 || ans.charAt(ans.length()-1)!='H')
	        N_CoinToss_Not_2H_2T(n-1,ans+"H");
	   
	    if(ans.length()==0 || ans.charAt(ans.length()-1)!='T')
	        N_CoinToss_Not_2H_2T(n-1,ans+"T");
	}
}
