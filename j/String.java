package j;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class String {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0;i <10;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<10; i++) {
			int result = arr[i] % 42;
			System.out.println(result);
		}

		Date now = new Date();
        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
	}
}

