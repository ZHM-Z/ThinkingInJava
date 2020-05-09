package thinkinginjava;

import org.junit.Test;

public class VarArgs {

	static void printArray(Object[] args) {
		for (Object obj : args) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
	
	static void printArrayN(Object... args) {
		for (Object obj : args) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
	
	@Test
	public void test1() {
		printArray(new Object[] {new Integer(12),new Float(3.14),new Double(11.11)});
		printArray(new Object[] {"one","two","three"});
		printArray(new Object[] {new A(),new A(),new A()});
	}
	
	@Test
	public void test2() {
		printArrayN(new Object[] {new Integer(12),new Float(3.14),new Double(11.11)});
		printArrayN(new Object[] {"one","two","three"});
		printArrayN(new Object[] {new A(),new A(),new A()});
		printArrayN((Object[])new Integer[] {1,2,3,4,5});
		printArrayN("只有一個");
	}

}

class A{
	
}
