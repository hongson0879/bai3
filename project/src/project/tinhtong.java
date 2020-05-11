package project;

import java.util.Scanner;

public class tinhtong {
		public static void main(String[] args) {
			int a,b;
			
			Scanner sc = new Scanner (System.in);
			
			System.out.print("Nhap gia tri a: ");
			a = sc.nextInt();
			
			System.out.print("Nhap gia tri b: ");
			b = sc.nextInt();
			
			int c = a+b;
			
			System.out.print("Tong cua "+a+" + "+b+" = "+c);
			
					
		}
}
