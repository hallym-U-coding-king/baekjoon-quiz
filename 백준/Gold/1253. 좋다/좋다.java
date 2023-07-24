

import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		long arr [] = new long[N];
		st = new StringTokenizer(bf.readLine());
		for(int i=0; i<arr.length; i++) {
			arr[i]=Long.parseLong(st.nextToken());
		}
		int cnt=0;
		Arrays.sort(arr);
		
		for(int k=0; k<N; k++) {
			long find =arr[k];
			int end=N-1;
			int start=0;
			
			while(end>start) {
				if(arr[start]+arr[end]<find) {
					start++;
				}else if(arr[start]+arr[end]>find) {
					end--;
				}else {
					if(start!=k && end!=k) {
						cnt++;
						break;
					}
					else if(start==k) {
						start++;
					}else if(end==k) {
						end--;
					}	
				}
			}
		}
		
		
		System.out.println(cnt);
	}

}
