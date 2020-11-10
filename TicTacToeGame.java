package tictoegame;

import java.util.Scanner;

public class TicTacToeGame {
	private static final int O = 0;
	static char[] Board = new char[10];
	
	public static char[] gameBoard() {
		for(int i=0;i<=Board.length;i++) {  
			 Board[i]=' '; 	
		}
		return Board;
	}
	
	 
	public static char chooseChoice() {
		char player = 'X';
		Scanner choice = new Scanner(System.in);
		while(true) {
			System.out.println("select your choice X or O");
			player = choice.next().toUpperCase().charAt(0);
			
			if(player == 'X' || player == 'O') {
				
			return player;
			}
			else {
				System.out.println("you entered invalid choice");
				continue;
			}
			
		}
	}
	
	
	public static void main(String[] args){
		
		System.out.println("Welcome to the tictactoe game");
		gameBoard();
		chooseChoice();
	}

		
		 
}


	


