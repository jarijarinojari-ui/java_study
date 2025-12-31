
public class Card {
	int point;
	
	
	Gift buy (Money money) {
		Gift gift = new Gift();
		
		getPoint();
		return gift;
	}
	
	void getPoint() {
		this.point += 1;
	}
}
