package board;
public class Board {
    public int size;
    public char matrix[][];

    public Board(int size, char symbol) {
        this.size = size;
        matrix = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = symbol;
            }
        }

    }
//to set default character for matrix
    public void boardSymbol(char symbol) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = symbol;
            }
        }
    }
//print the matrix
public void printBoard() {
    int sz = this.size;
        for (int i = 0; i < sz; i++) {
            for (int j = 0; j < sz; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


