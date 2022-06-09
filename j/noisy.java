package j;
import java.util.Scanner;
public class noisy {
    Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int R = sc.nextInt();
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int[] arr2 = new int[n];
		for(int i=0; i < n; i++) {
			arr[i] = sc.nextInt();
			arr2[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			if(Math.pow((arr[i] - a),2)+Math.pow((arr2[i] - b),2) >= Math.pow(R, 2)) {
				System.out.println("silent");
			}else {
				System.out.println("noisy");
			}
		}
    }
}
