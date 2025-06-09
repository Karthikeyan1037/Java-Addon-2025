package Day03;

public class Laptop {
	String name;
	String name1;
	
	Laptop(String name, String name1){
		this.name=name;
		this.name1=name1;
	}
	Laptop(Laptop copy){
		this.name=copy.name;
		this.name1=copy.name1;
	}
	void display() {
		System.out.println("Asus"+" "+name+" "+name1);
	}

	public static void main(String[] args) {
		
		Laptop in = new Laptop("Asus Mac Book", "8GB");
		in.display();
		
		System.out.println("Copied Constructor");
		Laptop out = new Laptop(in);
		out.display();
	}

}
