package computer;

import Car.Car;
import elec.Bluetooth;
import elec.Ctype;

public class Guest {
	Ctype ctype;// 인터페이스는 타입으로 선언할 수 있다.
	Bluetooth sell() {//인터페이스는 반환형에 사용할 수 있다.
		return new Car();
	}
	
	void  buy(Bluetooth b) {//인터페이스는 매게변수가 될 수 있다.
		int v = Bluetooth.version;
	}
}
