package thinkinginjava;

import java.util.Arrays;
import java.util.Random;

public class ArrayClassObj {
	public static void main(String[] args) {
		Integer[] a;
		Random random = new Random(47);
		a = new Integer[random.nextInt(20)];
		System.out.println("length of a ="+a.length);
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			a[i] = random.nextInt(500);
		}
		System.out.println(Arrays.toString(a));
	}
}
