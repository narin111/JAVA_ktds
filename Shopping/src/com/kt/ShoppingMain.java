package com.kt;

import java.util.Scanner;

import com.kt.entity.Computer;
import com.kt.entity.Gogak;
import com.kt.entity.Product;
import com.kt.entity.Refrigerator;
import com.kt.entity.TV;

public class ShoppingMain {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
//		Gogak gg = new Gogak(1000000);
//		gg.addProduct(new TV());
//		gg.addProduct(new Computer());
//		gg.addProduct(new Refrigerator());
//		gg.printBasket();
		
		Product[] pros = new Product[] {new Computer(), new TV(), new Refrigerator()};
		
		Gogak gg = new Gogak(5000);
		
		while(true) {
			menu();
			int sel = Integer.parseInt(sc.nextLine());
			if(sel==0) break;
			switch(sel) {
			case 1: gg.saleProductList(pros); break;
			case 2: gg.addProduct(new Computer()); break;
			case 3: gg.addProduct(new TV()); break;
			case 4: gg.addProduct(new Refrigerator()); break;
			case 5: gg.printBasket(); break;
			default: System.out.println("다시 입력하세요");
			}
			System.out.println();
		}
		
	}
	
	public static void menu() {
		System.out.println("kt mart");
		System.out.println("1. 판매목록 및 잔액보기");
		System.out.println("2. Computer 구매(1000원)");
		System.out.println("3. TV 구매(2000원)");
		System.out.println("4. Refrigerator 구매(3000원)");
		System.out.println("5. 구매목록 보기");
		System.out.println("0. 종료");
		System.out.print("선택>>");
	}
}
