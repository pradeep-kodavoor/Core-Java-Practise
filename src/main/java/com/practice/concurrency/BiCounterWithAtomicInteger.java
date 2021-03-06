package com.practice.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithAtomicInteger {

	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();

	// Locking the operations without using synchronized keyword
	// Instead of locking complete block of code we can use this and lock only
	// particular statements
	// This improves performance
	public void incrementI() {
		i.incrementAndGet();
	}

	public void incrementJ() {
		j.incrementAndGet();
	}

	public int getI() {
		return i.get();
	}

	public int getJ() {
		return j.get();
	}

}
