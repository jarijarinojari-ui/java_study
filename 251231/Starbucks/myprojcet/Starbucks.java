package myprojcet;

public class Starbucks implements StarbucksHead{
	int money = 0;
	int coffeeBean = 0;
	
	public void brewing() {
		Coffee coffee = new Coffee();
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getCoffeeBean() {
		return coffeeBean;
	}

	public void setCoffeeBean(int coffeeBean) {
		this.coffeeBean = coffeeBean;
	}
	
	
}
