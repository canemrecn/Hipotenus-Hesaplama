package hh;
import java.util.Scanner;
public class hhh {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. Kenari Giriniz: ");
		int a = scanner.nextInt();
		
		System.out.print("2. Kenari Giriniz: ");
		int b = scanner.nextInt();
		
		double c = Math.sqrt((a*a) + (b*b));
		
		System.out.println("Hipotenus: " + c);
	}
}
