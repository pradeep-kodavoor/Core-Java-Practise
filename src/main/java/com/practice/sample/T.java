package com.practice.sample;

import java.io.IOException;


public class T {

	public static void main(String[] args) throws IOException {

		// int[] intArray = new int[-3];
		
		String var0 = "a";
		int var1 = 0;
		// System.out.println(var0.hashCode());
		int var3 = var0 == null ? 0 : (var1 = var0.hashCode()) ^ var1 >>> 16;
		// System.out.println(var3);

		System.out.println(Integer.toBinaryString(1));
		System.out.println(1 >> 16);
		System.out.println(Integer.toBinaryString(34 >> 2));
		System.out.println(34 << 2);
		System.out.println(Integer.toBinaryString(34 << 2));
	}

}

