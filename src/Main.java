import java.util.Scanner;

/**
 * Main class where the source code is running
 * Ejercicio #4 - Semana 5 - Using Pitagoras theorem
 */
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Type the command: ");
    String input = scanner.nextLine();
    int[][] matrix = convertToMatrix(input);
    printMatrix(matrix);
    scanner.close();
  }

  public static int[][] convertToMatrix(String input) {
    String[] rows = input.split("#");

    int numRows = rows.length;
    int numCols = rows[0].length();

    int[][] matrix = new int[numRows][numCols];

    for (int i = 0; i < numRows; i++) {
      String row = rows[i];
      for (int j = 0; j < numCols; j++) {
        char ch = row.charAt(j);
        matrix[i][j] = convertCharToNumber(ch);
      }
    }

    return matrix;
  }

  private static int convertCharToNumber(char ch) {
    switch (ch) {
      case 'X':
        return 1;
      case 'Y':
        return 2;
      case 'Z':
        return 0;
    }
    return 0;
  }

  public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int value : row) {
        System.out.print(value + " ");
      }
      System.out.println();
    }
  }
}