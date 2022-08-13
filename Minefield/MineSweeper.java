package Minefield;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int row;
    int col;
    int mineNumber;
    String[][] board;
    String[][] gameBoard;
    boolean isWin = true;
    Scanner inp = new Scanner(System.in);

    MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.mineNumber = (row*col)/4;
        this.board = new String[row][col];
        this.gameBoard = new String[row][col];
    }

    void putMines() {

        // initialize the matrix to fix nullpointexception error
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = " - ";
            }
        }

        Random r = new Random();
        int counter = mineNumber;
        while (counter > 0) {
            int x = r.nextInt(this.row); // coordinates of mine
            int y = r.nextInt(this.col);
            if (board[x][y].equals(" * ")) { // checking if there is conflict place of mines
                continue;
            }
            board[x][y] = " * ";
            counter--;
        }
        System.out.println("location of mines:");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println("<<<<<<<<<<<<<<<<<<<<<");

    }

    void mineDetect(int x, int y) {
        if(board[x][y].equals(" * ")){
            System.out.println("You failed!");
            isWin = false;
            return;
        }
        int count = 0;
        for (int i = (x - 1); i <= (x + 1); i++) {//nokta etrafındaki mayını saymak
            for (int j = (y - 1); j <= (y + 1); j++) {

                if ((i < 0 || j < 0 || i >= this.row || j >= this.col)) {
                    continue;
                } else {
                    if (board[i][j].equals(" * ")) {
                        count++;
                    }
                }
            }
        }
        String s = String.valueOf(count);
        gameBoard[x][y] = s+ " ";
        

    }

    void showGameBoard() { // print game board
        if(isWin == false){
            return;
        }
        System.out.println("===================");
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }
        System.out.println("===================");
    }

    void gameBoardUpdate() {
        int x, y,succes = 0;
        while (isWin) {
            System.out.println("enter row:");
            x = inp.nextInt();
            System.out.println("enter column:");
            y = inp.nextInt();
            mineDetect(x, y);
            /*if(isWin == false){
                break;
            }*/
            showGameBoard();
            succes++;
            if(succes == (this.row * this.col)-mineNumber ){
                System.out.println("You Win!!");
                break;
            }
        }
    }

    void run() {
        putMines();
        /*------------------------------------- */
        System.out.println("welcome to game...");
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                gameBoard[i][j] = "- ";
            }
        }
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }
        /*---------------------------------------- */
        gameBoardUpdate();
    }

}
