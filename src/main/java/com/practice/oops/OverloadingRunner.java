package com.practice.oops;

class ParentClass {

	public Number[] add(Object a, Object b) {
		return null;
	}

	public double add(int a, int b, int c) {
		return a + b;
	}
}

class ChildClass extends ParentClass {

	@Override
	public Long[] add(Object a, Object b) {
		return null;
	}

	public double add(long a, int b, int c) {
		return a + b;
	}

}

public class OverloadingRunner {

	public static void main(String[] args) {

		ChildClass c = new ChildClass();

		// ParentClass s = new ChildClass();

		ParentClass p = new ParentClass();
		
		// ChildClass child = (ChildClass) new ParentClass();

		// c = (ChildClass) s;
		// s = c;
		// p=c;
		c = (ChildClass) p;


	}

}

