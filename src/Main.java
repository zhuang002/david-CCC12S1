import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int forth = sc.nextInt();
		
		System.out.println(combination(3,forth-1));

	}

	private static int combination(int m, int n) {
		int result = 1;
		for (int i=0;i<m;i++) {
			result *=(n-i);
		}
		
		for (int i=1;i<=m;i++) {
			result /= i;
		} 
		return result;
	}

}
