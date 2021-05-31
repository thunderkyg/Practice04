package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		int[] array = new int [5];
		array [0] = 3;
		array [1] = 7;
		array [2] = 12;
		
		int result = 0;
		for (int i = 0; i < array.length; i ++) {
			result = result + array[i];
		}
		System.out.println(result);
		

	}

}
