package elec;

public interface Bluetooth {
	// 상수
	int version = 5; //static, final(상수)이 생략되어 있다.
	// 추상 메서드 기본
	void connectBluetooth();
	// default 메서드  추가
	default void connectBluetoothModify() {
		
	}
	
	// static 메서드
	static void b2() {
		
	}
	
}
