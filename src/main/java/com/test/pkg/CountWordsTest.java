package com.test.pkg;
/**
 * This java program is all about how to find number of Words in a String/input text
 */
public class CountWordsTest {

	public static void main(String[] args) {
		/* Taking input text or String */
		String inputText = "Hi Ganesh How r you";
		//String inputText = "   Welcome   you in KK JavaTutorials     ";
		// String inputText = null;
		// String inputText ="";
		// String inputText ="      ";
		int wordsCount1 = countWordsUsingRegularExp(inputText);
		System.out.println("No. of words:" + wordsCount1);
		System.out.println("------------------------------------");
		int wordsCount2 = countWordsUsingCustomLogic(inputText);
		System.out.println("No. of words:" + wordsCount2);
	}
	
	//This method does not use direct API to get word count in input string
	private static int countWordsUsingCustomLogic(String inputText) {

		// Handle base condition if inputText is null or empty string.
		if (inputText == null || inputText.trim().isEmpty()) {
			System.out.println("Enter valid input text/String");
			return 0;
		}
		int wordsCount = 0;
		char charArray[] = new char[inputText.length()];
		for (int i = 0; i < inputText.length(); i++) {
			charArray[i] = inputText.charAt(i);
			// This check is necessary so that we do not try to read beyond the
			// string length
			if (i + 1 < inputText.length()) {
				charArray[i + 1] = inputText.charAt(i + 1);
			}

			/*
			 * This logic is that after reading the last character in a word it should be followed by either space or tab, in that case
			 * we increment the count value by 1
			 */
			if ((i + 1 < inputText.length()
					&& (charArray[i] != ' ' && charArray[i] != '\t') && (charArray[i + 1] == ' ' || charArray[i + 1] == '\t'))
					|| (i + 1 == inputText.length() && charArray[i] != ' ')) {
				wordsCount++;
			}
		}
		return wordsCount;
	}

	//This method uses split method of String class to get word count in input string
	private static int countWordsUsingRegularExp(String inputText) {
		// Handle base condition if inputText is null or empty string.
		if (inputText == null || inputText.trim().isEmpty()) {
			System.out.println("Enter valid input text/String");
			return 0;
		}
		/*
		 * Here we are using split method of the string class with the regular
		 * expression pattern ("\\s+") of any spaces So it will return a string
		 * array with words
		 */
		String[] wordsArray = inputText.trim().split("\\s+");
		int countWords = wordsArray.length;
		return countWords;
	}
}