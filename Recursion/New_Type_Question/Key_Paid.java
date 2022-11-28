// Recursive Solution of Nokia Phone Problem Solution

import java.util.*;

public class Key_Paid {

	static String[] key = { "", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz" };

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		printKeyPaid(str, "");

	}

	public static void printKeyPaid(String ques, String ans) {// 12
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		char ch = ques.charAt(0);// '1'--> 49
		String pressString = key[ch - 48];// ch-->49

		for (int i = 0; i < pressString.length(); i++) {
			printKeyPaid(ques.substring(1), ans + pressString.charAt(i));

		}

	}

}
