package a;


public class StarbucksTester {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Money money = new Money(10000);
		Guest guest = new Guest(money, 2 );
		Starbucks starbucks = new Starbucks();
		guest.buy(starbucks);
		guest.buy(starbucks);
		guest.buy(starbucks);
		guest.buy(starbucks);
		guest.buy(starbucks);
		guest.buy(starbucks);
		guest.buy(starbucks);
		System.out.println();
		
	}

}
