package project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static String[] readFile() {
		String fileName = "hangman.txt";
		String line = null;
		String[] result = null;

		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				result = line.split(" ");
				return result;
			}

			bufferedReader.close();

		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}
		return result;

	}
}
