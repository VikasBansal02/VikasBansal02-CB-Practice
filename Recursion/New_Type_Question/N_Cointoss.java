// Write a Recursive Function program to Print N CoinToss Simultatously,N entered by the User

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); // Number of Coins
		N_CoinToss(N,"");
	}
	
	public static void N_CoinToss(int n, String ans){
	    // Base case 
	    if(n==0){
	        System.out.print(ans+" ");
	        return;
	    }
	    
	    //Recursive call
	    N_CoinToss(n-1,ans+"H");
	    N_CoinToss(n-1,ans+"T");
	}
}
