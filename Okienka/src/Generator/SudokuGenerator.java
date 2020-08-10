package Generator;

import java.util.*;

public class SudokuGenerator {

    public int [][] testSudoku = new int[9][9];

    public int[][] generateSudoku() {
        testSudoku[0][0] = 9; testSudoku[0][1] = 3; testSudoku[0][2] = 5; testSudoku[0][3] = 8; testSudoku[0][4] = 6; testSudoku[0][5] = 1; testSudoku[0][6] = 4; testSudoku[0][7] = 7; testSudoku[0][8] = 2;
        testSudoku[1][0] = 8; testSudoku[1][1] = 7; testSudoku[1][2] = 4; testSudoku[1][3] = 3; testSudoku[1][4] = 2; testSudoku[1][5] = 5; testSudoku[1][6] = 9; testSudoku[1][7] = 6; testSudoku[1][8] = 1;
        testSudoku[2][0] = 1; testSudoku[2][1] = 2; testSudoku[2][2] = 6; testSudoku[2][3] = 4; testSudoku[2][4] = 7; testSudoku[2][5] = 9; testSudoku[2][6] = 3; testSudoku[2][7] = 5; testSudoku[2][8] = 8;
        testSudoku[3][0] = 4; testSudoku[3][1] = 9; testSudoku[3][2] = 2; testSudoku[3][3] = 5; testSudoku[3][4] = 3; testSudoku[3][5] = 8; testSudoku[3][6] = 6; testSudoku[3][7] = 1; testSudoku[3][8] = 7;
        testSudoku[4][0] = 6; testSudoku[4][1] = 8; testSudoku[4][2] = 3; testSudoku[4][3] = 7; testSudoku[4][4] = 1; testSudoku[4][5] = 4; testSudoku[4][6] = 2; testSudoku[4][7] = 9; testSudoku[4][8] = 5;
        testSudoku[5][0] = 7; testSudoku[5][1] = 5; testSudoku[5][2] = 1; testSudoku[5][3] = 6; testSudoku[5][4] = 9; testSudoku[5][5] = 2; testSudoku[5][6] = 8; testSudoku[5][7] = 4; testSudoku[5][8] = 3;
        testSudoku[6][0] = 2; testSudoku[6][1] = 6; testSudoku[6][2] = 8; testSudoku[6][3] = 1; testSudoku[6][4] = 4; testSudoku[6][5] = 7; testSudoku[6][6] = 5; testSudoku[6][7] = 3; testSudoku[6][8] = 9;
        testSudoku[7][0] = 5; testSudoku[7][1] = 4; testSudoku[7][2] = 7; testSudoku[7][3] = 9; testSudoku[7][4] = 8; testSudoku[7][5] = 3; testSudoku[7][6] = 1; testSudoku[7][7] = 2; testSudoku[7][8] = 6;
        testSudoku[8][0] = 3; testSudoku[8][1] = 1; testSudoku[8][2] = 9; testSudoku[8][3] = 2; testSudoku[8][4] = 5; testSudoku[8][5] = 6; testSudoku[8][6] = 7; testSudoku[8][7] = 8; testSudoku[8][8] = 4;
        return testSudoku;

    }


    public void randomize(Integer[] list, int a) {
        int i, j = a, k;


        if (a < 2)
            return;

        i = a - 1;
        while ((i > 0) && (list[i - 1] >= list[i]))
            i--;

        if (i > 0) {
            while ((j > 0) && (list[j - 1] <= list[i - 1]))
                j--;
        }

        if ((i > 0) && (j > 0)) {
            k = list[i - 1];
            list[i - 1] = list[j - 1];
            list[j - 1] = k;
        }


    }

    public void generate(int[][] list) {
        for (int[] ints : list) {
            for (int anInt : ints) System.out.format("%3d", anInt);
            System.out.println();

        }
    }

    public boolean validate (int[][] sudoku){
        boolean result = false;
        int k = 0;
        int perpendicularly = 0;
        Set<Integer> listToValidate = new HashSet<>();
        for (int a = 1; a <= 9; a++){
            for (int j = 0; j <= 8; j++){
            listToValidate.add(sudoku[j][k]);
        }
            if (listToValidate.size() == 9){
                k++;
                result = true;
            }else {
                result = false;
                break;
            }
            listToValidate.clear();
        }k = 0;
        for (int square = 1; square <= 9; square++) {
            for (int x = perpendicularly; x <= 2; x++) {
                listToValidate.add(sudoku[x][k]);
                listToValidate.add(sudoku[x][k + 1]);
                listToValidate.add(sudoku[x][k + 2]);
            }
            if (listToValidate.size() == 9) {
                k = k + 3;
                result = true;
            } else {
                result = false;
                break;
            }
            if (square == 3 && k == 9){
                perpendicularly = perpendicularly + 3;
                k = 0;
            }else if (square == 6 && k == 9){
                perpendicularly = perpendicularly + 3;
                k = 0;
            }
        }
        return result;
    }

    //easy 36 fields (45)
    public int[][] easyMode(int[][] sudoku){
        int[][] easyList = sudoku;
        return easyList;
    }

    //medium 27 fields (54)
    public int[][] mediumMode(int[][] sudoku){
        int[][] mediumList = sudoku;
        return mediumList;
    }

    //hard 21 fields (60)
    public int[][] hardMode(int[][] sudoku){
        int[][] hardList = sudoku;
        return hardList;
    }
}
