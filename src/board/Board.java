package board;
public class Board {
    int size;
    char matrix[][];

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
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


