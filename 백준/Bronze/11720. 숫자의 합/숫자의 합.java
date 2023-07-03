import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int loopcnt=sc.nextInt();
		String num=sc.next();
		int answer=0;
		
		for(int i=0; i<loopcnt; i++) {
			answer+=Character.getNumericValue(num.charAt(i));
		}
		
		System.out.println(answer);
	}

}