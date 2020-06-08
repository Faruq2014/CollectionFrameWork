package com.arraysMultiDimensionBasics;

import java.util.Scanner;

public class Tic1 {
	

	 
    private static int state;
    private static char[][] board;
     
    public static void main(String[] args) {
        //variables and initializing
        board = new char[3][3];
        initializeArray();
         
        //start playing
        while(!won()) {
            move();
        }
        if(won()) {
            if(state%2 == 0) System.out.println("Player 1 won");
            else System.out.println("Player 2 won");
        }
    }
     
    //method to initialize 3x3 2D array
    public static char[][] initializeArray(){
        state = 0;
        for(int i=0; i<=2; i++) {
            for(int j=0; j<=2; j++) {
                board[i][j] = '-';
            }
        }
         
        return board;
    }
     
    public static boolean isBoardFull() {
        for(int i = 0; i<=2; i++) {
            for(int j = 0; j<=2; j++) {
                if(board[i][j] == '-') return false;
            }
        }
        return true;
    }
     
     
    //method to determine the move the current player entered
        //validate the move in this method
    public static int move() {
        Scanner sc = new Scanner(System.in);
        while(!isBoardFull() && state!=9) {
            System.out.println("Player, enter a row");
            int row = sc.nextInt();
            System.out.println("Player, enter a col");
            int col = sc.nextInt();
            if(board[row][col] == 'x' || board[row][col] == 'o') {
                System.out.println("Position filled. Try again");
                row = sc.nextInt();
                col = sc.nextInt();
            }
            if(board[row][col] == '-') {
                if(state%2==0) {
                    board[row][col] = 'x';
                }
                else board[row][col] = 'o';
            }
            printBoard();
            state++;
        }
        if(draw()) System.out.println("Game ended in draw");
        sc.close();
        return state;
    }
         
    //method to update the game immediately if the game has been won
    public static boolean won() {
        boolean won = false;
        if(draw()) System.out.println("Game Over - No one wins");
        for(int i=0; i<3; i++) {
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                System.out.println("We have a winner!");
                if(board[i][0] == 'x') System.out.println("Player 1 wins");
                else System.out.println("Player 2 wins");
                won = true;
            }
        }
        for(int i=0; i<3; i++) {
            if(board[0][i] == board[1][i] && board[2][i] == board[1][i]) {
                System.out.println("We have a winner!");
                if(board[0][i] == 'x') System.out.println("Player 1 wins");
                else System.out.println("Player 2 wins");
                won = true;
            }
        }
         
        if(board[0][0]==board[1][1] && board[1][1] == board[2][2]) {
            System.out.println("We have a winner!");
            if(board[0][0] == 'x') System.out.println("Player 1 wins");
            else System.out.println("Player 2 wins");
            won = true;
        }
         
        if(board[2][0]==board[1][1] && board[0][2] == board[1][1]) {
            System.out.println("We have a winner!");
            if(board[2][0] == 'x') System.out.println("Player 1 wins");
            else System.out.println("Player 2 wins");
            won = true;
        }
             
        return won;
    }
     
     
    //a method to determine if the game has ended a draw
    public static boolean draw() {
        boolean draw = true;
        for(int i=0; i<=2; i++) {
            for(int j=0; j<=2; j++) {
                if(board[i][j] == '-') draw = false;
            }
        }
        return draw;
    }
    //a method to print the board
    public static void printBoard() {
         System.out.println("-------------");
         for (int i = 0; i < 3; i++) {
             System.out.print("| ");
             for (int j = 0; j < 3; j++) {
                 System.out.print(board[i][j] + " | ");
             }
             System.out.println();
             System.out.println("-------------");
         }
    }
     

}
