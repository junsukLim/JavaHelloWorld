package com.example.lab1;

import java.util.Scanner;

public class Maiun {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Hello World!!!\n");
		System.out.print("학번 입력 : ");
		int student_number = s.nextInt();
		System.out.println("["+student_number+"]님 환영합니다~");
	}

}