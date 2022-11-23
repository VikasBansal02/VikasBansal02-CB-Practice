// Write a Recursive program to generate vaild GenerateParentheses of N, entered by the User 
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<String> list = new ArrayList<>();
		GenerateParentheses(n, 0, 0, "", list);
		System.out.println(list);

	}

	public static void GenerateParentheses(int n, int open, int close, String ans, List<String> list) {
		if (open == n && close == n) {
			//System.out.println(ans);
			list.add(ans);
			return ;
		}
		if (open < n) {
			GenerateParentheses(n, open + 1, close, ans + "(", list);
		}
		if (close < open) {
			GenerateParentheses(n, open, close + 1, ans + ")", list);
		}
	}
}
