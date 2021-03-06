package thinkinginjava;

/**
 * 显示静态初始化
 * 
 * @author Zhouming
 *
 */
class Cup {
	Cup(int marker) {
		System.out.println("Cup (" + marker + ")");
	}

	void f(int marker) {
		System.out.println("f (" + marker + ")");
	}
}

class Cups {
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}

	public Cups() {
		System.out.println("Cups()");
	}
}

public class ExplicitStatic {

	public static void main(String[] args) {
		System.out.println("inside main()");
		Cups.cup1.f(9);//1
	}
	static Cups cups1 = new Cups();//2
	static Cups cups2 = new Cups();//2

}
