package com.test.pkg;


import java.util.Scanner;
 /**
  * 
  *THis java Java program is all about How to check whether a number is prime or not
  */
public class CheckPrimeNumberTest {
	
	public static void main(String[] args) {
	Scanner scanner = null;
    try {
    	//Taking input from the user using scanner
		scanner = new Scanner(System.in);
		System.out.println("Enter number which u want to check whether prime or not:");
		int number = scanner.nextInt();
		boolean flag = isPrimeNumber(number);
		if(flag){
		    System.out.println(number + " is a prime number.");
		}else{
		    System.out.println(number + " is not a prime number.");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		if(scanner != null)
			scanner.close();
	}
}
 
private static boolean isPrimeNumber(int number){
    boolean flag = true;
    if(number <= 1){  
    	flag = false;
    	return flag;
   }
    //for loop start from 2 and increment it till number/2
    for(int i = 2; i <=number/2; i++){
        //if no remainder found means we get divider 
        if(number % i == 0){
            flag = false;
            break;
        }
    }
    return flag;
}}