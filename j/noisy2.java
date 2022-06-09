package j;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class noisy2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      String abR = br.readLine();
	      StringTokenizer st = new StringTokenizer(abR);
	      int N = Integer.parseInt(br.readLine());
	      int a = Integer.parseInt(st.nextToken());
	      int b = Integer.parseInt(st.nextToken());
	      int R = Integer.parseInt(st.nextToken());
	      ArrayList<String> results = new ArrayList<>();

	      for (int i = 0; i < N; i++) {
	         StringTokenizer st = new StringTokenizer(br.readLine());
	         int x = Integer.parseInt(st.nextToken());
	         int y = Integer.parseInt(st.nextToken());
	         String check = "noisy";
	         
	         if (Math.pow((x - a), 2) + Math.pow((y - b), 2) >= Math.pow(R, 2)) {
	            check = "silent";
	         } 

	         results.add(check);
	      }
	      
	      results.forEach((result) -> {
	         System.out.println(result);
	      });

	   }

}

