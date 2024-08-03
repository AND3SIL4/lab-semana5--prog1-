package classes;

import java.util.Scanner;

/**
 * Main class where the source code is running
 * Ejercicio #2 - Semana 5 - Working with matrices
 */

public class Diagonales{
  public static void main() {
    //Instance the Scanner class
    Scanner scanner = new Scanner(System.in);
    int size = userInputs(scanner);
    int[][] matrix = setMatrix(size, scanner);
    printMatrix(matrix);
    int result = calculateResult(matrix);
    System.out.println("The total result is: " + result);
  }

  //Method to set the entire matrix
  public static int[][] setMatrix(int size, Scanner scanner){
    int[][] matrix = new int[size][size];
    for (int row = 0; row <matrix.length ; row++) {
      for (int column = 0; column < matrix[row].length ; column++) {
        System.out.print("Enter value for matrix[" + row + "][" + column + "]: ");
        matrix[row][column] = scanner.nextInt();
      }
      System.out.println();
    }
    return matrix;
  }

  //Method to print the matrix
  public static void printMatrix(int[][] matrix){
    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        System.out.print(matrix[row][column] + " ");
      }
      System.out.println();
    }
  }

  public static int getFirstDiagonal(int[][] matrix){
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }

  public static int getSecondMatrix(int[][] matrix){
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][matrix.length - 1 - i];
    }
    return sum;
  }

  //Method to calculate the result
  public static int calculateResult(int[][] matrix){
    int first = getFirstDiagonal(matrix);
    int second = getSecondMatrix(matrix);
    return first + second;
  }

  //Method to get the user inputs
  public static int userInputs(Scanner scanner){
    System.out.println("Type the matrix dimension");
    System.out.print("Rows amount: ");
    return scanner.nextInt();
  }
}
