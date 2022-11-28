//Recursive function to print all the permutation of the String, entered by the User

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println();
		printPermutation(str, "");

	}

	public static void printPermutation(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {

			char ch = ques.charAt(i);

			String ros = ques.substring(0, i) + ques.substring(i + 1);

			printPermutation(ros, ans + ch);

		}

	}

}
