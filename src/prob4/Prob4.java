package prob4;
public class Prob4 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		char[] arr = str.toCharArray();
		char temp;
		
		for(int i = 0; i < str.length()/2; i++) {
			temp = arr[i];
			arr[i] = arr[str.length()-1-i];
			arr[str.length()-1-i] = temp;
		}
		
		return arr;
	}

	public static void printCharArray(char[] array){
		for(char c : array) {
			System.out.print(c);
		}
		System.out.println();
	}
}
