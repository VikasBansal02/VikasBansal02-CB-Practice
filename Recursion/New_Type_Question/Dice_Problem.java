// Recursive function find No of steps you can take to reach on N using given dice, Input to be taken from User
import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
// 		System.out.println("\n" + Boardpath(n, 0, ""));
        System.out.println("\n" + dice_problem(n, 0, ""));

	}

	public static int Boardpath(int end, int curr, String ans) {
		if (curr == end) {
			System.out.print(ans + " ");
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		int fp = Boardpath(end, curr + 1, ans + 1);
		int sp = Boardpath(end, curr + 2, ans + 2);
		int tp = Boardpath(end, curr + 3, ans + 3);

		return fp + sp + tp;

	}

	public static int dice_problem(int end, int curr, String ans) {
		if (curr == end) {
			System.out.print(ans + " ");
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		
		int count = 0;
		for (int dice = 1; dice <= 3; dice++) {
			count = count + dice_problem(end, curr + dice, ans + dice);
		}

		return count;

	}

}
