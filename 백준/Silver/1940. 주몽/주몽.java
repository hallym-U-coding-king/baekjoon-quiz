

import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(bf.readLine());
		int M=Integer.parseInt(bf.readLine());
		int arr[]=new int[N];
		int cnt=0;
		StringTokenizer st= new StringTokenizer(bf.readLine());
		
		for(int i=0; i<N; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int start=0;
		int end=N-1;
		
		while(start<end) {
			int sum=arr[start]+arr[end];
			if(sum==M) {
				cnt++;
				end--;
				start++;
			}
			else if(sum>M) {
				end--;
			}else {
				start++;
			}
		}
		
		System.out.println(cnt);
		
	}

}
