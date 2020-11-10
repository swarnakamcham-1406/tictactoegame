package tictoegame;

import java.util.Scanner;

public class TicTacToeGame {
	
	static char[] Board = new char[10];
	static char player = ' ';
	static char computer = ' ';
	
	
	public static char[] initializeBoard() {
		for(int i=1;i>=Board.length;i++) {  
			 Board[i]=' '; 	
		}
		return Board;
	}
	
	 
	public static char chooseChoice() {
		
		
		Scanner choice = new Scanner(System.in);
		
			
			System.out.println("select your choice X or O");
			player = choice.next().toUpperCase().charAt(0);
			
			if(player == 'X') {
				player = 'x';
				computer = 'o';
			
			}
			else if(player == 'O') {
				player = 'o';
				computer = 'x';
			
			}
			
			else 
			
				System.out.println("you entered invalid choice");
			
			return 0;
		}
		
		
	
	
	public static void input() {
		Scanner input = new Scanner(System.in);
		while(true) {
			
			System.out.println("enter value in between 1 to 9 ");
			int value = input.nextInt();
			if(value >= 1 && value <= 9) {
				if(Board[value] == ' ') {
					Board[value]=player;
				
				}
				else {
					System.out.println("place is already filled");
				}
		
			}
			else {
				System.out.println("you entered invalid value");
			}
	
		}
		
	}
	
	public static void showBoard() {
		
		for(int i=1;i<=3;i++) {
			
			System.out.println("|" +Board[i] + "|" +Board[i+1] + "|" +Board[i+2]);
			System.out.println("------------");
			
		}
	}
	
	public static void main(String[] args){
		
		System.out.println("Welcome to the tictactoe game");
		initializeBoard();
		showBoard();
		chooseChoice();
		input();
	}

		
		 
}


	


