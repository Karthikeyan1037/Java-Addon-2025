package Day04;

class Laptop{
	void OS(){
		System.out.println("Windows 10");
	}
}
class Update extends Laptop{
	void OS() {
		System.out.println("Windows 11");
	}
}

public class Methodoverriding {

	public static void main(String[] args) {
		Update u = new Update();
		u.OS();

	}

}
