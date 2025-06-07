package Day02;

public class sumofeven {

	public static void main(String[] args) {
		//int[] number = {1,2,3,4,5};
		
		int[] number = new int[5];
		number[0]=1;
		number[1]=2;
		number[2]=3;
		number[3]=4;
		number[4]=5;
		int sum;
		//System.out.println(number[3]);
		//System.out.println(number.length);
		for(int i=0; i<5;i++) {
			if (number[i] % 2 == 0) {
				sum = i+i;
				System.out.println(+sum);
			}
			//sum = sum+number[i];
			//System.out.println(number[i]);
			//System.out.println("Sum is " +sum);
			
		}
		
// To print in reverse order		
//		for(int i=number.length-1;i>=0;i--) {
//			System.out.println(number[i]);
//		}
	}

}


           