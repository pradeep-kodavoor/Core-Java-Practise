package com.practice.exceptions;

public class CheckedExceptionRunner {

	public static void main(String[] args) {
		try {
			threadSleep();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void threadSleep() throws InterruptedException {
		Thread.sleep(1000);
	}

}
