package hi;
import java.util.Scanner;

public class hi {
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i=0; i < result.length; i++) {
			result[i] = times*(i+1);
		}
		return result;
	}
	public static void pr(int[] result) {
		for(int i=0; i< result.length; i++) {
			System.out.println(result[i]);
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("몇단까지...? :");
		num = input.nextInt();
		for(int i=2; i < num+1; i++) {
			int[] result = calculate(i);
			System.out.println(i+"단");
			pr(result);
		}
	}
}