﻿package ex;

/*
 * Topic: 讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入");
		int n = scn.nextInt();
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum *= i;
		}
		System.out.println(sum);

	}

}
