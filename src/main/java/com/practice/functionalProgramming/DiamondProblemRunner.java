package com.practice.functionalProgramming;

interface BaseInterface {

	default void display() {
	}

}

interface BaseOne extends BaseInterface {

	@Override
	default void display() {
		System.out.println("Base one..");
	}

	static void displayThree() {
		System.out.println("Three..");
	}

}

interface BaseTwo extends BaseInterface {

	@Override
	default void display() {
		System.out.println("Base Two..");
	}

}

class ChildClass implements BaseOne, BaseTwo {

	@Override
	public void display() {
		BaseTwo.super.display();
	}

}

public class DiamondProblemRunner {

	public static void main(String[] args) {
		ChildClass child = new ChildClass();
		child.display();
		BaseOne.displayThree();

	}

}
