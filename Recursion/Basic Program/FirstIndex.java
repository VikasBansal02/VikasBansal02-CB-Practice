// Write a Recursive Function program to find the first Occurence of a Number

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
		System.out.println(FirstIndex(arr,item,0));
	}
	
	public static int FirstIndex(int []arr,int item,int index){
	    // Base case 
	    if(index==arr.length){
	        return -1;
	    }
	    if(arr[index]==item){
	        return index;
	    }
	    //Recursive call
	    return FirstIndex(arr,item,index+1);
	       
	}
}
