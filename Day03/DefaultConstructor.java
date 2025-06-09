package Day03;

public class DefaultConstructor {
		String name;
		int year;
		String language;
		//parameterized constructor
		DefaultConstructor(String name, String language ,int year){
		this.name=name;
		this.year=year;
		this.language=language;
		}
		//copy constructor
		DefaultConstructor(DefaultConstructor copy){
			this.name=copy.name;
			this.year=copy.year;
			this.language=copy.language;
}
		void display() {
			System.out.println("Default Constructor"+ " "+name+ " "+language+ " "+year);
		}
		
	public static void main(String[] args) {
		//to create object
		//classname reference variable = new classname();
		
		DefaultConstructor ref = new DefaultConstructor("Java","Programming",1995);
		ref.display();
		
		
		DefaultConstructor ref2 = new DefaultConstructor(ref);
		System.out.println("Copy Constructor");
		ref2.display();
	}

}
