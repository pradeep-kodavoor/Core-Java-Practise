package com.practice.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapRunner {

	public static void main(String[] args) {

		Map<A, String> map = new HashMap<>();
		
		map.put(new A(1, "Hello"), "Test String A");
		map.put(new A(2, "World"), "Test String B");
		map.put(new A(3, "Hello"), "Test String A");
		map.put(new A(4, "Hello"), "Test String A - Modified");
		
		for (A a : map.keySet()) {
			// map.put(new A(1, "Hello"), "Test String C");
			//map.put(new A(5, "Hello"), "Test String C"); // throws java.util.ConcurrentModificationException
			System.out.println(a + " " + map.get(a));
		}
		System.out.println();
		map.forEach((key, value) -> {
			// map.put(new A(1, "Hello"), "Test String C");
			// map.put(new A(5, "Hello"), "Test String C"); // throws java.util.ConcurrentModificationException
			System.out.println(key + " " + value);
		});
		System.out.println();
		for (Entry<A, String> entry : map.entrySet()) {
			// map.put(new A(1, "Hello"), "Test String C");
			// map.put(new A(5, "Hello"), "Test String C"); // throws java.util.ConcurrentModificationException
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}


class A {

	private int id;
	private String name;

	public A(int id, String name) {
		super();
		this.name = name;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		// final int prime = 31;
		int result = 1;
		// result = prime * result + id;
		// result = prime * result + (name == null ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		A other = (A) obj;
		if (id != other.id) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + "]";
	}

}
