

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), "-");
		String arr[] = new String[50];

		int sum = 0;
		int answer = 0;
		int jj=0;
		int loopcnt=st.countTokens();
		
		while(st.hasMoreTokens()) {
			arr[jj]=st.nextToken();
			jj++;
		}
		
		String num[] = new String[50];
		for (int i = 0; i < loopcnt; i++) {
			sum=0;
			st = new StringTokenizer(arr[i], "+");
			while (st.hasMoreTokens()) {
				int now = Integer.parseInt(st.nextToken());
				sum += now;
			}
			
			if (i == 0) {
				answer += sum;
			} else {
				answer -= sum;
			}		
		}

		System.out.println(answer);

	}

}
