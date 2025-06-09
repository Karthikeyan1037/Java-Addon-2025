package Day03;
//superclass
class superclass{
	void message(){
		System.out.println("Superclass");
	}
}
//subclass1(Subclass of superclass)
class subclass1 extends superclass{
	void method1(){
		System.out.println("Subclass1");
	}
}
//subclass2(Subclass of subclass1)
class subclass2 extends subclass1{
	void view(){
		System.out.println("Subclass2");
	}
}
public class Multilevel{
   public static void main(String[] args){
	   subclass in = new subclass();
	   in.message();
}
}
