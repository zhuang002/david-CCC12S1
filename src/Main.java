import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int forth = sc.nextInt();
		
		int count = 0;
		for (int i=1;i<forth;i++) {
			for (int j=i+1;j<forth;j++) {
				for (int k=j+1;k<forth;k++) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
