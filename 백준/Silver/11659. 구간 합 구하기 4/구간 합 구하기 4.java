import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numcnt = sc.nextInt();
		int loopcnt = sc.nextInt();
		sc.nextLine();
		int Asum[]=new int[numcnt+1];
		Asum[0]=0;
		for(int i=1; i<numcnt+1; i++) {
			Asum[i]=Asum[i-1]+sc.nextInt();
		}
		
		for(int i=0; i<loopcnt; i++) {
			int start=sc.nextInt();
			int end=sc.nextInt();
			System.out.println(Asum[end]-Asum[start-1]);
		}
		
	}

}