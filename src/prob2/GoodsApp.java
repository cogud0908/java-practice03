package prob2;

import java.util.Scanner;

public class GoodsApp {

	private static final int COUNT_GOODS = 3;
	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		Goods []goods = new Goods[COUNT_GOODS];
				
		System.out.println("상품 가격 재고 입력");
		
		for(int i = 0; i < goods.length; i++)
		{
			goods[i] = new Goods();
			goods[i].setName(sc.next());
			goods[i].setPrice(sc.nextInt());
			goods[i].setCountStock(sc.nextInt());
		}
		
		for(int i = 0; i < goods.length; i++)
		System.out.println(goods[i].getName()+"(가격 :"+goods[i].getPrice()+"원)이 "+goods[i].getCountStock()+"개 입고 되었습니다.");
		
	}

}
