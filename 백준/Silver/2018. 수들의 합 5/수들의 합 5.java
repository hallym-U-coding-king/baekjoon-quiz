import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int cnt = 0;
		int N = Integer.parseInt(bf.readLine());
		int arr[] = new int[N + 2];

		for (int i = 1; i < arr.length; i++) {
			arr[i] = i;
		}

		int sum = 0;
		int start = 1;
		int end = 1;

		while (end <= N || start <= N) {

			if (sum > N) {
				sum -= arr[start++];
			}

			else if (sum < N) {
				sum += arr[end++];
			}

			else if (sum == N) {
				cnt++;
				sum += arr[end++];
			}
		}

		System.out.println(cnt);

	}

}
