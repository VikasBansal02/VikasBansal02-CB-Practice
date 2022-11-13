// Write a Recursive Function program to find the All Occurence of a Number

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
		ArrayList<Integer> list = new ArrayList<Integer>();
		AllIndex(arr,item,list,0);
		for(int i=0;i<list.size();i++)
		    System.out.print(list.get(i)+" ");
	}
	
	public static void AllIndex(int []arr,int item,ArrayList<Integer> list,int index){
	    // Base case 
	    if(index==arr.length){
	        return;
	    }
	    if(arr[index]==item){
	        list.add(index);
	    }
	    //Recursive call
	    AllIndex(arr,item,list,index+1);
	       
	}
}
