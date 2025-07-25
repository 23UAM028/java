package com.dikshant;
import java.util.*;

public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a==b) {
			System.out.println("number is equal");
			
		}else {
			if(a>b) {
				System.out.println("greater");

			}else {
				System.out.println("lesser");

			}
			
			
		}
	}

}
