import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String word = sc.nextLine().toLowerCase();
			int cnt = 0;
			if (word.equals("#"))
				break;
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' )
					cnt++;
			}
			System.out.println(cnt);
		}
	}
}