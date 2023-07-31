
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxx=0,maxy=0;
		int minx=1001,miny=1001;
		int cntx=0, cnty=0;
		Scanner sc = new Scanner(System.in);
		int arr[][]=new int[3][2];
		
		for(int i=0; i<3; i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
		    @Override
			public int compare(int[] o1, int[] o2) {
		    	 return o1[0]-o2[0];
	           }
	        });
		
		
		
		if(arr[0][0]==arr[1][0]) {
			cntx=arr[2][0];
		}else {
			cntx=arr[0][0];
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
		    @Override
			public int compare(int[] o1, int[] o2) {
		    	return o1[1] - o2[1];
	           }
	        });
		
		if(arr[0][1]==arr[1][1]) {
			cnty=arr[2][1];
		}else {
			cnty=arr[0][1];
		}
		

		System.out.println(cntx+" "+cnty);
		
	}

	
}
