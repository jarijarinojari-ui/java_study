package a;

public class Starbucks {
	Money money;
	public Starbucks() {
		money = new Money(0);
	}
	
	Coffee sell(Money gMoney) {
		this.money = money;
		while(true) {
			if ( Constants.ONE_CUP_PRICE > gMoney.won) {
				System.out.println("잔액이 부족합니다.");
				return null;
			}
			money.won += Constants.ONE_CUP_PRICE;
			gMoney.won -= Constants.ONE_CUP_PRICE;
			return new Coffee();
			
		}
		
	}
	

}
