package Day03_Task;

public class Task1  {
	void fulltime(double salary) {
		System.out.println("Salary of full time employee:"+salary);
	}
	void parttime(double amount,int hours) {
		
		double psalary=amount*hours;
			System.out.println("Salary of parttime employee:"+psalary);	
	}
	void freelancer(double amount,int hours,double bonus) {
		double fsalary=amount*hours+bonus;
		System.out.println("Salary of Freelancer employee:"+fsalary);
	}
	public static void main(String[] args) {
		 Task1 in=new Task1();
		
		 in.fulltime(50000);
		 
		 in.parttime(100,60);
		 
		 in.freelancer(2000, 5, 2000);
	}

}
