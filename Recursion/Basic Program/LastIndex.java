// Write a Recursive Function program to find the last Occurence of a Number from the array

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt(); // Size of the Array
		int []arr = new int[size];
		for(int i=0;i<size;i++)
		    arr[i]=scan.nextInt(); // Elements for the array
		int item = scan.nextInt(); // element to be searched in the array
		System.out.println(LastIndex(arr,item,0,0));
	}
	
	public static int LastIndex(int []arr,int item,int index,int prev){
	    // Base case 
	    if(index==arr.length ){
	        return prev;
	    }
	    if(arr[index]==item){
	        prev=index;
	    }
	    //Recursive call
	    return LastIndex(arr,item,index+1,prev);
	       
	}
}
