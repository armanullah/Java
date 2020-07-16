import java.util.Scanner;

/*
 * Class: CMSC201
 * Instructor:
 * Description: (Give a brief description for each Program)
 * Due: 03/01/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Arman Khan
*/

public class Main {

    public static void main(String[] args) {
        int rows, columns;
        Scanner stdin = new Scanner(System.in);
        System.out.println("Please enter the amount of rows and columns you want in your matrix/grid.");
        System.out.println("Enter the rows: ");
        rows = stdin.nextInt();
        System.out.println("Enter columns");
        columns = stdin.nextInt();

        System.out.println("Enter values into the matrix/grid: ");
        int[][] grid = new int[rows][columns];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = stdin.nextInt();
            }
        }

        System.out.println(isConsecutiveFour(grid));
    }

    public static boolean isConsecutiveFour(int[][] values) {
        return checkRows(values) || checkColumns(values) || checkDiagonal(values);

    }

    public static boolean checkRows(int[][] values) {
        // checking rows
        for (int i = 0; i < values.length; i++) {
            int current = values[i][0];
            int consecutiveCount = 0; // values[i][0] starts count

            for (int j = 0; j < values[i].length; j++) {

                if (values[i][j] == current) {
                    consecutiveCount++;
                    if (consecutiveCount == 4) return true;
                } else {
                    current = values[i][j];
                    consecutiveCount = 1;
                }
            }
        }
        return false;
    }

    public static boolean checkColumns(int[][] values) {
// check columns
        for (int j = 0; j < values[0].length; j++) {
            int consecutiveCount = 0; // values[0][j] starts count
            int current = values[0][j];

            for (int i = 0; i < values.length; i++) {

                if (values[i][j] == current) {
                    consecutiveCount++;
                    if (consecutiveCount == 4) return true;
                } else {
                    current = values[i][j];
                    consecutiveCount = 1;
                }

            }
        }

        return false;
    }

    public static boolean checkDiagonal(int[][] values) {

        for (int i = 0; i < values.length; i++) {
            int x = values[i][0];
            int total = 1;
            for (int j = i+1, k = 1; j < values.length && k < values[0].length; j++, k++) {
                if (x == values[j][k]) {
                    total++;
                } else {
                    x = values[j][k];
                    total = 1;
                }
                if (total == 4) {
                    return true;
                }
            }
        }

        for (int i = 0; i < values[0].length; i++) {
            int x = values[0][i];
            int total = 1;
            for (int j = i+1, k = 1; j < values[0].length && k < values.length; j++, k++) {
                if (x == values[k][j]) {
                    total++;
                } else {
                    x = values[k][j];
                    total = 1;
                }

                if (total == 4) {
                    return true;
                }
            }
        }

        for (int i = 0; i < values[0].length; i++) {
            int x = values[0][i];
            int total = 1;
            for (int j = 1, k = i-1; j < values.length && k >= 0; j++, k--) {
                if (x == values[j][k]) {
                    total++;
                } else {
                    x = values[j][k];
                    total = 1;
                }
                if (total == 4) {
                    return true;
                }
            }
        }

        for (int i = 0; i < values.length; i++) {
            int start = values[i][values[i].length-1];
            int total = 1;
            for (int j = i+1, k = values[0].length-2; j < values.length && k >= 0; j++, k--) {
                if (start == values[j][k]) {
                    total++;
                } else {
                    start = values[j][k];
                    total = 1;
                }
                if (total == 4) {
                    return true;
                }
            }
        }

        return false;

    }
}



