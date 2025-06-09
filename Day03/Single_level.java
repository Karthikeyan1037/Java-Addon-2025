package Day03;

public class Single_level {
	void message() {
	
	System.out.println("Hai");
}
}

class subclass extends Single_level{
	void view() {
		System.out.println("Byeeeeeeeee");
	}
}
class main{
	
	public static void main(String[] args) {
		subclass in = new subclass();
		in.message();
		in.view();
	}

}
