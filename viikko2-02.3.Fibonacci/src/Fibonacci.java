
import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n==0) return 0;
		if (n==1) return 1;
		int min2 = 0;
		int min1 = 1;
		int fibo = 1;
		int i = 2;
		while (i < n) {
			min2 = min1;
			min1 = fibo;
			fibo = min1 + min2;
			i++;
		}
		return fibo;
    }
    

    public static Scanner lukija = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("n: ");
        int n = lukija.nextInt();
        System.out.println("F(n): " + fibonacci(n) );
    }
}
