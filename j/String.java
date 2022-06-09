package j;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class String {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String []arr = new String[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.next();
		}		
		System.out.print("Hello ");
		for(int i=0; i<(n-1); i++) {
			System.out.print(arr[i]+",");
		}
		System.out.print(arr[(n-1)]+".");
	}
}

