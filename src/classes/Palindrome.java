package classes;

import java.util.Scanner;

/**
 * Main class where the source code is running
 * Ejercicio #3 - Semana 5 - Palindrome String
 */

public class Palindrome {
  public static void main(String[] args) {
    //Instance the scanner class
    Scanner scanner = new Scanner(System.in);
    String word = userInput(scanner);
    boolean result = isPalindrome(word);
    System.out.println(result ? "It is" : "It's not");
  }

  public static boolean isPalindrome(String input){
    StringBuilder result = new StringBuilder(input).reverse();
    return input.contentEquals(result);
  }

  //Method to get the user inputs
  public static String userInput(Scanner scanner){
    System.out.print("Type a word to know if is palindrome or not: ");
    return scanner.nextLine();
  }
}