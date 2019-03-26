package com.practice.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileReadRunner {

	public static void main(String[] args) throws IOException {

		Path currentDirectory = Paths.get(".\\src\\main\\resources\\data.txt");

		List<String> list = Files.readAllLines(currentDirectory);
		// Converting list of string to a single string
		String string = list.stream().collect(Collectors.joining("\n"));
		System.out.println(string);

		Files.lines(currentDirectory).map(String::toUpperCase).filter(str -> str.contains("oo"))
				.forEach(e -> System.out.println(e));
		// System.out.println(list);
	}

}
