package Day01;
import java.util.Scanner;

public class Intro {

		public static void main(String[] args) {
			System.out.println("Enter the Starting number:");
			Scanner in = new Scanner(System.in);
			int a=in.nextInt();
			System.out.println("Enter the Ending number");
			int b=in.nextInt();
			for(int i=a;i<=b;i++) {
				if(i%2==0) {
					System.out.println("Even Numbers are:"+i);
			}				
			}
		}
}

	