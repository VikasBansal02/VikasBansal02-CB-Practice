// Reverse_stack
// Reverse the given Stack without using Extra Space or Data Structure

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    Stack<Integer> st = new Stack<>();
	    int size = scan.nextInt();
	    for(int i=0;i<size;i++)
	        st.push(scan.nextInt());
	   // st.push(10);
	   // st.push(20);
	   // st.push(30);
	   // st.push(40);
	   // st.push(50);
	    System.out.println(st);
	    Reverse_stack(st);
	    System.out.println(st);
	}
	
	public static void Insert_Bottom(Stack<Integer> st, int item){
	    if(st.isEmpty()){
	        st.push(item);
	        return;
	    }
	    int x = st.pop();
	    Insert_Bottom(st,item);
	    st.push(x);
	}
	
	public static void Reverse_stack(Stack<Integer> st){
	    if(st.isEmpty()){
	        return;
	    }
	    int x = st.pop();
	    Reverse_stack(st);
	    Insert_Bottom(st,x);
	    
	}
}
