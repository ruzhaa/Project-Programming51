package project;

import javax.swing.JButton;

public class HangmanMethods extends HangmanFrame {

	public static String[] secretWords = { "object", "interface", "java",
			"python" };

	private static String currentWord;
	private static String currentGuess;
	private static int nextWord = 0;

	public static String choiseNewWord() {
		double number = Math.random();
		nextWord = (int) (number * secretWords.length);
		currentWord = secretWords[nextWord];
		guess();
		return currentWord;
	}

	private static String guess() {
		currentGuess = "@";
		for (int i = 0; i < currentWord.length() - 1; i++) {
			currentGuess = currentGuess + "@";
		}
		answer.setText(currentGuess);
		return currentGuess;
	}

	private static String setCurrentGuess(int index, char str) {

		str = currentWord.charAt(index);
		String temp = currentGuess.substring(0, index) + str
				+ currentGuess.substring(index + 1, currentGuess.length());
		currentGuess = temp;
		return currentGuess;

	}

	public static void processAnswer(JButton button) {
		String tempWord = currentGuess;
		String buttonText = button.getText().toLowerCase();
		int currentIndex = 0;
		currentIndex = currentWord.indexOf(buttonText, currentIndex);
		while(currentIndex > -1) {
			tempWord = setCurrentGuess(currentIndex, buttonText.charAt(0));
			answer.setText(tempWord);
			currentIndex = currentWord.indexOf(buttonText, currentIndex+1);
		}

	}

}
