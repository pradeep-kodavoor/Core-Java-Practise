package com.practice.oops;

abstract class AbstractClass {
	public AbstractClass() {
		System.out.println("Abstract class constructor..");
	}
}

class Child extends AbstractClass {
	public void display() {
		System.out.println("Display..");
	}
}

public class AbstractClassRunner {

	public static void main(String[] args) {
		Child instance = new Child();
		instance.display();
	}

}
