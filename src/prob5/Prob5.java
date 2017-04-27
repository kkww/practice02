package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t1 = 1;
		int t2 = 100;
		int input = 0;
		int count = 1;
		
		Random r = new Random();
		int k = r.nextInt(100) + 1;
		
		System.out.println("수를 결정하였습니다. 맞추어 보세요.\n" + t1 + "-" + t2);
		
		do {
			System.out.print(count + ">>");
			input = scanner.nextInt();
			count++;
			
			if(input < k) {
				System.out.println("더 높게");	
				if(k-t1 > k-input)
					t1 = input;
				System.out.println(t1 + "-" + t2);
			}
			else if(input > k) {
				System.out.println("더 낮게");
				if(t2-k > input-k)
					t2 = input;
				System.out.println(t1 + "-" + t2);
			}
			else if(input == k) {
				System.out.println("맞았습니다.\n다시하시겠습니까(y/n)>>");
				String answer = scanner.next();
				if(answer.equals("y")){
					r = new Random();
					k = r.nextInt(100) + 1;
					count = 1;
					t1 = 1;
					t2 = 100;
					
					System.out.println("수를 결정하였습니다. 맞추어 보세요.\n1-100");
					continue;
				} else {
					break;
				}
			}
			
		} while(true);
		
		System.out.println("end.");
	}

}