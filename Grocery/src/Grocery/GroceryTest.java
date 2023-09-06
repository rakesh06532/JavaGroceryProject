package Grocery;

import java.util.Scanner;

public class GroceryTest {
	public static void main(String[] args) {
		GroceryProduct p=new GroceryProduct();
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t WELCOME TO OUR SHOPING MALL");
		System.out.println("===========================================================");
		p.getProduct();
		sc.close();
	}

}
