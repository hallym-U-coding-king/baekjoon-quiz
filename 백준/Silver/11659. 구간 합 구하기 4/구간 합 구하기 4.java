import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(buffRead.readLine());
		int numcnt = Integer.parseInt(st.nextToken());
		int loopcnt = Integer.parseInt(st.nextToken());
		int Asum[] = new int[numcnt + 1];
		st = new StringTokenizer(buffRead.readLine());
		for (int i = 1; i < numcnt + 1; i++) {
			Asum[i] = Asum[i - 1] + Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < loopcnt; i++) {
			st = new StringTokenizer(buffRead.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			System.out.println(Asum[end] - Asum[start - 1]);
		}
	}

}