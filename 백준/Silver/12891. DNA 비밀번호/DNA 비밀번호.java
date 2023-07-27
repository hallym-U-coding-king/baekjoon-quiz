

import java.util.*;
import java.io.*;

public class Main {
	static String sarr[];
	static int answer[] = new int[4];
	
	static void add(int index) {
		if (sarr[index].equals("A")) {
			answer[0]++;
		}else if(sarr[index].equals("C")) {
			answer[1]++;
		}else if(sarr[index].equals("G")) {
			answer[2]++;
		}else{
			answer[3]++;
		}
	}
	
	static void del(int index) {
		if (sarr[index].equals("A")) {
			answer[0]--;
		}else if(sarr[index].equals("C")) {
			answer[1]--;
		}else if(sarr[index].equals("G")) {
			answer[2]--;
		}else{
			answer[3]--;
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int s = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int cnt = 0;
		int parr[] = new int[4];

		String asd=bf.readLine();
		sarr=asd.split("");
		
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < 4; i++) {
			parr[i] = Integer.parseInt(st.nextToken());
		}

		
		int i = 0;
		int j = i + p - 1;
		for(int k=0; k<p-1; k++) {
			add(k);
		}
		
		while (i < s-p+1) {
			add(j);
			boolean flag=true;
			for(int q=0; q<4; q++) {
				if(answer[q]<parr[q]) {
					flag=false;
					break;
				}
			}
			if(flag) {
				cnt++;
			}
			del(i);
			i++;
			j++;
			
		}
		
		System.out.println(cnt);

	}

}
