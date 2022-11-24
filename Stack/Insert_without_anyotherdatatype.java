// Insert_Demo
// Insert Element in the given Stack without using extra Memory or any datatype

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   // Scanner scan = new Scanner(System.in);
	    Stack<Integer> st = new Stack<>();
	    st.push(10);
	    st.push(20);
	    st.push(30);
	    st.push(40);
	    st.push(50);
	    System.out.println(st);
	    Insert(st,-3);
	    System.out.println(st);
	}
	
	public static void Insert(Stack<Integer> st, int item){
	    if(st.isEmpty()){
	        st.push(item);
	        return;
	    }
	    int x = st.pop();
	    Insert(st,item);
	    st.push(x);
	}
}
