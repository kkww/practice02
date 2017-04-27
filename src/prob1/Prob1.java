package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int[] count = new int[10];
		
		Scanner scanner = new Scanner( System.in );
		System.out.print("금액 : ");
		int m = scanner.nextInt();
		
		System.out.println(m);
		
		for(int i = 0; i < 10; i++) {
			count[i] = m/MONEYS[i];
			m = m - MONEYS[i]*count[i];
			
			System.out.println(MONEYS[i] + "원 : " + count[i] + "개");
		}
		
		scanner.close();
 	}
}