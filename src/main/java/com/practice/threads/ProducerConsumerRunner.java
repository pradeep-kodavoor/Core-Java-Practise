package com.practice.threads;

import java.util.Deque;
import java.util.LinkedList;

public class ProducerConsumerRunner {

	public synchronized static void main(String[] args) throws InterruptedException {

		ProducerConsumer pc = new ProducerConsumer();

		Thread producerThread = new Thread(() -> {
			try {
				pc.produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread consumerThread = new Thread(() -> {
			try {
				pc.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		producerThread.start();
		consumerThread.start();

		// consumerThread.join();
		// producerThread.join();

	}
}

class ProducerConsumer {

	private Deque<String> list = new LinkedList<>();

	private static int i = 1;

	private boolean flag = false;

	public void produce() throws InterruptedException {

		while (true) {
			synchronized (this) {
				if (list.size() == 1) {
					this.wait();
				}
				// while (list.size() < 3) {
				System.out.println("Produce Job " + i);
				list.add("Job " + i);
				i++;
				Thread.sleep(1000);
				// }
				flag = true;
				notify();

			}
		}
	}

	public void consume() throws InterruptedException {

		while (true) {

			synchronized (this) {
				if (list.isEmpty()) {
					this.wait();
				}
				while (!list.isEmpty()) {
					System.out.println("Consumer " + list.removeFirst());
					Thread.sleep(100);
				}
				flag = false;
				notify();

			}
		}

	}
}
