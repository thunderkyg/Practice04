package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] array = new int[5];
		int sum = 0;
		double average;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
			sum = sum + array[i];
		}
		average = sum/array.length;
		System.out.println("평균은 " + average + " 입니다.");
		
		input.close();
	}

}
