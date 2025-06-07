package Day02;
import java.util.Random;
import java.util.Scanner;
public class OTP {
		static int OTP(){
			Random ran = new Random();
			return 100 + ran.nextInt(500);	
		}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Phone Number:");
		long a = 9442641405L;
		long num = in.nextLong();
		
		//System.out.println("OTP GENERATED:");
		if(num == a) {
			System.out.println("Number Matched!!!!");
			int otp = OTP();
			System.out.println("One Time Password" +" " +otp);
		}
		else {
			System.out.println("Nummber Mismatched");
		}
	}

}