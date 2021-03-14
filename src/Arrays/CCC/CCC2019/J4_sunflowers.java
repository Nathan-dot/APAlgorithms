package Arrays.CCC.CCC2019;
import java.util.Scanner;

public class J4_sunflowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        boolean rowcheck = true;
        boolean columncheck = true;
        int[][] a = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int[][] table = a;
        while (rowcheck && columncheck) {
            for (int i = 0; i < table.length; i++) {
                for (int j = 0; j < table[i].length - 1; i++) {
                    if (table[i][j] > table[i][j + 1]) {
                        rowcheck = false;
                        break;
                    }
                }
            }
            for (int i = 0; i < table.length; i++) {
                for (int j = 0; j < table.length - 1; j++) {
                    if (table[j][i] > table[j + 1][i]) {
                        columncheck = false;
                        break;
                    }
                }
            }
            table = rotateTable(table);
        }
        printTable(table);
    }


    private static int[][] rotateTable(int[][] table) {
        int size = table.length;
        int[][] rotatedTable = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rotatedTable[j][size - 1 - i] = table[i][j];
            }
        }
        return rotatedTable;
    }

    private static void printTable(int[][] table) {
        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

