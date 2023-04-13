package com.blabz.SnakeLadder;

import java.util.Random;
public class SnakeLadder {
	public static void main(String[] args) {
		int start;
	
		start =  0; 
	
		System.out.println("Player Starting Position will be:~ ");
		System.out.println(+start);
		
		Random random = new Random();
		int dice = random.nextInt(6)+1;
		System.out.println("dice roll result: "+dice);
	
	}

}
