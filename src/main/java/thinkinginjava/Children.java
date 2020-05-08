package thinkinginjava;


public class Children extends Parent {
	
	public Children() {
		System.out.println("子类构造方法");
	}
	
	{
		System.out.println("子类代码块");
	}
	static {
		System.out.println("子类静态代码块");
	}

	public static void main(String[] args) {
		Children.find();
		new Children();
	}
}

class Parent{
	public Parent() {
		System.out.println("父类构造方法");
	}
	{
		System.out.println("父类代码块");
	}
	static {
		System.out.println("父类静态代码块");
	}
	public static void find() {
		System.out.println("父类静态方法");
	}
}