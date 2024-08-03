package classes;
import java.util.Scanner;

/**
 * Main class where the source code is running
 * Ejercicio #1 - Semana 5 - Using Pitagoras theorem
 */
public class Methods {
  public static void methods() {
    System.out.println("This is the menu, type a number to choose one");
    //Instance the Scanner class
    Scanner scanner = new Scanner(System.in);
    //Show menu
    int showMenu = showMenu(scanner);
    //Display the options
    displayMenuOptions(showMenu, scanner);
    //Close scanner
    scanner.close();
  }

  //Method to calculate a triangle hypotenuse
  public static double calculateHypotenuse(int sideA, int sideB){
    double resultSuma = Math.pow(sideA, 2 ) + Math.pow(sideB, 2);
    return Math.sqrt(resultSuma);
  }

  //Method to calculate a triangle high
  public static double calculateSide(int hypotenuse, int sideB){
    double result = Math.pow(hypotenuse, 2) - Math.pow(sideB, 2);
    return Math.sqrt(result);
  }

  //Method to show menu
  public static int showMenu(Scanner scanner){
    System.out.println("1. Calculate hypotenuse");
    System.out.println("2. Calculate any side");
    System.out.print("Which one you want to chose: ");
    return scanner.nextInt();
  }

  //Method to display menu options
  public static void displayMenuOptions(int option, Scanner scanner){
    switch (option){
      case 1:
        System.out.print("Type the value for side a: ");
        int sideA = scanner.nextInt();
        System.out.print("Type the value for side b: ");
        int sideB = scanner.nextInt();
        double resultHy = calculateHypotenuse(sideA, sideB);
        System.out.printf("The hypotenuse is: %.2f", resultHy);
        break;
      case 2:
        System.out.print("Type the value for side hypotenuse: ");
        int hypotenuse = scanner.nextInt();
        System.out.print("Type the value for side: ");
        int side = scanner.nextInt();
        double resultHi = calculateSide(hypotenuse, side);
        System.out.printf("The value for the triangle side is: %.2f", resultHi);
        break;
      default:
        System.out.println("Incorrect option, try again");
    }
  }
}
