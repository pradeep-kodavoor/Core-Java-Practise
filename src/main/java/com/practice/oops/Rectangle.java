package com.practice.oops;

public class Rectangle {

	private int length;
	private int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public int areaOfRectangle() {
		return length * breadth;
	}

}
