package a;

public class Guest {
	Money money;
	Coffee[] coffeeArr;
	int buyCount;
	
	Guest(Money money , int size) {
		// TODO Auto-generated constructor stub
		coffeeArr = new Coffee[size];
		this.money = money;
	}
	void buy (Starbucks starbucks) {
		if ( buyCount >= coffeeArr.length ) {
			System.out.println("초과 구매입니다.");
			return;
			
		}
		coffeeArr[buyCount] = starbucks.sell(money);
		buyCount++;
	}
}
