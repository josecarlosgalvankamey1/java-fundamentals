import java.util.Scanner;

public class TicTacToe {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    int win = -1;

    System.out.println("\nLet's play tic tac toe");

    // Task 1: Create an array with three rows of '_' characters.
    char[][] board = { { '_', '_', '_' }, { '_', '_', '_' }, { '_', '_', '_' } };

    // Task 2: Call the function printBoard();
    printBoard(board);

    /*
     * { Task 3: Loop through turns.
     * 
     * if (X) turn {
     * Task 4: call askUser().
     * Task 5: populate the board using askUser's return value.
     * } else {
     * Task 4: call askUser().
     * Task 5: populate the board using askUser's return value. Then, print it.
     * 
     * }
     * 
     * Task 6 - Call the function.
     * if return value == 3 {
     * print: X wins and break the loop
     * } else if return value == -3 {
     * print: O wins and break the loop
     * }
     * 
     * }
     */

    for (int i = 0; i < 9; ++i) {
      if (i % 2 != 1) {
        System.out.print("Turn X: ");
        int[] userChose = askUser(board);
        board[userChose[0]][userChose[1]] = 'X';
        printBoard(board);
      } else {
        System.out.print("Turn O: ");
        int[] userChose = askUser(board);
        board[userChose[0]][userChose[1]] = 'O';
        printBoard(board);
      }

      win = checkWin(board);
      if (win == 3) {
        System.out.println("X wins!");
        break;
      } else if (win == -3) {
        System.out.println("O wins");
        break;
      }
    }

    if (win == -1) {
      System.out.println("It's a tie!");
    }

    scan.close();
  }

  /**
   * Task 2 - Write a function that prints the board.
   * Function name - printBoard()
   * 
   * @param board (char[][])
   * 
   *              Inside the function:
   *              1. print a new line.
   *              2. print the board.
   *              • separate each row by two lines.
   *              • each row precedes a tab of space
   *              • each character in the grid has one space from the other
   *              character
   */
  public static void printBoard(char[][] board) {
    System.out.println();

    for (int i = 0; i < board.length; ++i) {
      System.out.print("\t");
      for (int j = 0; j < board[i].length; ++j) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println("\n");
    }
  }

  /**
   * Task 4 - Write a function that lets the user choose a spot
   * Function name – askUser
   * 
   * @param board (char[][] board)
   * @return spot (int[])
   * 
   *         Inside the function
   *         1. Asks the user: - pick a row and column number:
   *         2. Check if the spot is taken. If so, let the user choose again.
   *         3. Return the row and column in an int[] array.
   * 
   */
  public static int[] askUser(char[][] board) {
    int row = -1, column = -1;
    System.out.print("Pick a row and a column number: ");
    row = scan.nextInt();
    column = scan.nextInt();

    while (true) {
      if (!(row >= 0 && row <= 2 && column >= 0 && column <= 2)) {
        System.out.print("row or column not valid, try again: ");
        row = scan.nextInt();
        column = scan.nextInt();
      } else if (board[row][column] != '_') {
        System.out.print("Spot taken, try again: ");
        row = scan.nextInt();
        column = scan.nextInt();
      } else {
        break;
      }
    }

    return new int[] { row, column };
  }

  /**
   * Task 6 - Write a function that determines the winner
   * Function name - checkWin
   * 
   * @param board (char[][])
   * @return count (int)
   * 
   *         Inside the function:
   *         1. Make a count variable that starts at 0.
   *         2. Check every row for a straight X or straight O (Task 7).
   *         3. Check every column for a straight X or straight O (Task 8).
   *         4. Check the left diagonal for a straight X or straight O (Task 9).
   *         5. Check the right diagonal for a straight X or straight O (Task 10).
   */
  public static int checkWin(char[][] board) {
    int rows = checkRows(board);
    if (rows == 3 || rows == -3)
      return rows;

    int columns = checkColumns(board);
    if (columns == 3 || columns == -3)
      return columns;

    int leftDiagonal = checkLeftDiagonal(board);
    if (leftDiagonal == 3 || leftDiagonal == -3)
      return leftDiagonal;

    int rightDiagonal = checkRightDiagonal(board);
    if (rightDiagonal == 3 || rightDiagonal == -3)
      return rightDiagonal;

    return -1;
  }

  public static int checkRows(char[][] board) {
    int count = 0;

    for (int i = 0; i < board.length; ++i) {
      for (int j = 0; j < board[i].length; ++j) {
        if (board[i][j] == 'X')
          ++count;
        else if (board[i][j] == 'O')
          --count;
      }
      if (count == 3 || count == -3)
        return count;
      else
        count = 0;
    }

    return count;
  }

  public static int checkColumns(char[][] board) {
    int count = 0;

    for (int i = 0; i < board.length; ++i) {
      for (int j = 0; j < board[i].length; ++j) {
        if (board[j][i] == 'X')
          ++count;
        else if (board[j][i] == 'O')
          --count;
      }
      if (count == 3 || count == -3)
        return count;
      else
        count = 0;
    }

    return count;
  }

  public static int checkLeftDiagonal(char[][] board) {
    int count = 0;

    for (int i = 0; i < board.length; ++i) {
      for (int j = 0; j < board[i].length; ++j) {
        if (i == j && board[i][j] == 'X')
          ++count;
        else if (i == j && board[i][j] == 'O')
          --count;
      }
      if (count == 3 || count == -3)
        return count;

    }

    return count;
  }

  public static int checkRightDiagonal(char[][] board) {
    int count = 0;

    for (int i = 0; i < board.length; ++i) {
      if (board[board.length - i - 1][i] == 'X')
        ++count;
      else if (board[board.length - i - 1][i] == 'O')
        --count;

      if (count == 3 || count == -3)
        return count;
    }

    return count;
  }
}
