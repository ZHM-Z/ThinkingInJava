package thinkinginjava.chapter7;

public class C extends A {
	
	private B b;

	public static void main(String[] args) {
		C c = new C();
		c.getB();
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
}
