package com.test.pkg;

/**
 *In this java program we will see how to Split a String by provided any delimiter
 */
public class SplitStringTest {

	public static void main(String[] args) {
		String inputTextCommaDelimiter = "Dada,mama,kaka,tai,did,dady";
		splitStringCommaDelimiter(inputTextCommaDelimiter);
		
		String inputTextTabDelimiter = "Dada mama kaka tai did dady";
		splitStringTabDelimiter(inputTextTabDelimiter);
		
		String inputTextPipeDelimiter = "Dada|mama|kaka|tai|did|dady";
		splitStringPipeDelimiter(inputTextPipeDelimiter);
	}

	//Method to split input string based on pipe(|) delimiter
	private static void splitStringPipeDelimiter(String inputTextPipeDelimiter) {
		System.out.println("Input String splitted based on pipe(|) delimiter:");
		if(inputTextPipeDelimiter == null || inputTextPipeDelimiter.isEmpty()){
			System.out.println("Enter valid String..");
			return;
		}
		//As we knnow that pipe(|) is also used in conditions like OR (||) 
		//so that is a special symbol and needs to be escaped.
		String delimeter = "\\|";
		String[] splitStringArray = inputTextPipeDelimiter.split(delimeter);
		for (String s : splitStringArray) {
			System.out.println(s);
		}
	}

	//This method shows how  to split input string based on tab(\t) delimiter
	private static void splitStringTabDelimiter(String inputTextTabDelimiter) {

		System.out.println("Input String splitted based on tab("+"\\t"+")"+" delimiter:");
		if(inputTextTabDelimiter == null || inputTextTabDelimiter.isEmpty()){
			System.out.println("Enter valid String..");
			return;
		}
		//Here delimiter is tab(\t)
		String delimeter = "\t";
		String[] splitStringArray = inputTextTabDelimiter.split(delimeter);
		for (String s : splitStringArray) {
			System.out.println(s);
		}
	
	}
	//Method to split input string based on comma(,) delimiter
	private static void splitStringCommaDelimiter(String inputTextCommaDelimiter) {

		System.out.println("Input String splitted based on comma(,) delimiter:");
		if(inputTextCommaDelimiter == null || inputTextCommaDelimiter.isEmpty()){
			System.out.println("Enter valid String..");
			return;
		}
		//Here delimiter is comma(,)
		String delimeter = ",";
		String[] splitStringArray = inputTextCommaDelimiter.split(delimeter);
		for (String s : splitStringArray) {
			System.out.println(s);
		}
	}
}