package com.vranec;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecipherAlgorithm algorithm = new MonoAlphabeticalHomophone(scanner);
		String input = new Example3Input().readInput(scanner);
		algorithm.decipher(input);
		scanner.close();
	}
}
