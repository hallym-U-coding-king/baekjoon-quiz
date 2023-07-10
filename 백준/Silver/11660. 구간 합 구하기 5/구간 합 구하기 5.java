import java.util.StringTokenizer;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(bf.readLine());
		
		int Nlength=Integer.parseInt(st.nextToken());
		int loopnum=Integer.parseInt(st.nextToken());
		
		int tarr[][]=new int [Nlength+1][Nlength+1];
		int aarr[][]=new int [Nlength+1][Nlength+1];

		for(int i=1; i<Nlength+1; i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=1; j<Nlength+1; j++) {
				aarr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=1; i<Nlength+1; i++) {
			for(int j=1; j<Nlength+1; j++) {
				tarr[i][j]=tarr[i][j-1]+tarr[i-1][j]-tarr[i-1][j-1]+aarr[i][j];
			}
			
		}
		
		for(int i=0; i<loopnum; i++) {
			st=new StringTokenizer(bf.readLine());
			int x1=Integer.parseInt(st.nextToken());
			int y1=Integer.parseInt(st.nextToken());
			int x2=Integer.parseInt(st.nextToken());
			int y2=Integer.parseInt(st.nextToken());
			int sum=0;
			sum=tarr[x2][y2]-tarr[x1-1][y2]-tarr[x2][y1-1]+tarr[x1-1][y1-1];
			System.out.println(sum);
		}
	}
}