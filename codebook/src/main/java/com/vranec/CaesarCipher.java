package com.vranec;

public class CaesarCipher implements DecipherAlgorithm {

	private static final int LETTERS_COUNT = 'Z' - 'A';

	public void decipher(String input) {
		System.out.println("Deciphering Caesar Cipher...");
		System.out.println("Trying every possible combination...");

		for (byte i = 0; i < LETTERS_COUNT; i++) {
			System.out.println("Shifted by " + i + ":" + shiftInput(input, i));
		}
	}

	private String shiftInput(String input, byte i) {
		StringBuilder result = new StringBuilder();
		for (char ch : input.toCharArray()) {
			if (!Character.isLetter(ch)) {
				result.append(ch);
				continue;
			}
			ch += i;
			if (ch > 'Z') {
				ch -= LETTERS_COUNT + 1;
			}
			result.append(ch);
		}
		return result.toString();
	}
}
