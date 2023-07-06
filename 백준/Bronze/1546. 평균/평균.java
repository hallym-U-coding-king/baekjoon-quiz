
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int subcnt=sc.nextInt();
		sc.nextLine();
		String scStr = sc.nextLine();
		String realnum []=scStr.split("\\s");
		double realnum2 []=new double[subcnt];
		double max=-1;
		double sum=0;
		
		for(int i=0; i<realnum.length; i++) {
			realnum2[i]=Double.parseDouble(realnum[i]);
		}
		
		for(int i=0; i<realnum2.length; i++) {
			if(max<realnum2[i]) {
				max=realnum2[i];
			}
		}
		
		for(int i=0; i<realnum2.length; i++) {
			sum+=(realnum2[i]/max)*100;	}
		
		System.out.println(sum/subcnt);
    }
}