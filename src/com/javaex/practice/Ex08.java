package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		
		int[] array = new int[6];
		
		for(int i = 0 ; i < array.length; i++ ) {
			array[i] = (int)(Math.random() * 45)+ 1;
			
			for (int j = 0; j < i; j++) {
				if(array[i] == array[j]) {
					i--;
				}
			}		
		}
		for(int output = 0; output < array.length; output++) {
			System.out.print(array[output] + "  ");
		}
	}

}