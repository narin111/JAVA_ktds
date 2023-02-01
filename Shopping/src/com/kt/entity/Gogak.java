package com.kt.entity;

public class Gogak {
	private int money;
	private Product[] basket = new Product[5];
	private int count;
	
	public Gogak(int money) {
		this.money = money;
	}
	
	public void saleProductList(Product[] proList) {
		System.out.println("[제품목록 및 가격]");
		for(int i=0; i<proList.length; i++) {
			System.out.println(proList[i].getName()+"\t"+proList[i].getPrice()+"원");
		}
		System.out.println("-------------");
		System.out.println("잔액: "+money+"원");
	}
	public void addProduct(Product product) {
		if(money<product.getPrice()) {
			System.out.println("잔액부족");
			return;
		}
		
		if(basket.length <= count) {
			Product[] newBasket = new Product[basket.length*2];
			System.arraycopy(product, 0, newBasket, 0, basket.length);
			basket = newBasket;
			
	
 		}
		
		basket[count++] = product;
		money -= product.getPrice();
		System.out.println(product.getName()+"제품을 구매했습니다. 잔액:"+money+"원");
	}
	
	public void printBasket() {
		// 구매 목록과 잔액을 출력
		// Computer: 1개
		// TV: 2개
		// 사용금액: 5000원
		// 잔액:5000원
		
		int tvcnt=0, comcnt=0, refcnt=0;
		int totamt = 0;
		for(int i=0; i<count; i++) {
			totamt += basket[i].getPrice();
			if(basket[i] instanceof TV) {
				tvcnt++;
			} else if(basket[i] instanceof Computer) {
				comcnt++;
			}
			
		}
		System.out.println("[구매내역 및 잔액]");
		if(tvcnt>0) System.out.println("TV :" + tvcnt);
		if(comcnt>0) System.out.println("Computer :" + comcnt);
		if(refcnt>0) System.out.println("Refrigerator :" + refcnt);
		
		System.out.println("사용금액: "+ totamt);
		System.out.println("잔액: " + money);
	}
	
	
}
