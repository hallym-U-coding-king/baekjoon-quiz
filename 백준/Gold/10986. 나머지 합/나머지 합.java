

import java.util.StringTokenizer;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int n =Integer.parseInt(st.nextToken());
		int m =Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(bf.readLine());
		long Narr []= new long[n+1];
		long c []= new long[m]; //나머지가 같은게 몇개 있는지 세는 배열c
		long cnt=0;
		
		//합배열의 원소를 m으로 나눈 나머지값으로 하는 배열"Narr" 초기화
		for(int i=1; i<n+1; i++) {
			Narr[i]=(Narr[i-1]+Long.parseLong(st.nextToken()))%m; 
			c[(int)Narr[i]]++; //나올 수 있는 나머지값의 개수를 count
			if(Narr[i]==0) {
				cnt++; //나머지가 0인 원소를 정답개수에 더함
			}
		}

		//c 배열에서 나머지가 같은 인덱스끼리의 조합 경우의 수 계산 nCm
		for(int i=0; i<m; i++) {
			if(c[i]>1) {
				cnt+=c[i]*(c[i]-1)/2;
			}
		}
		
		System.out.println(cnt);
	}
	
}
