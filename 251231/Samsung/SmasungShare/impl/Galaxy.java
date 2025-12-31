package SmasungShare.impl;

import SmasungShare.BlueTooth;
import SmasungShare.SamsugElec;

public class Galaxy {
	void share(BlueTooth bluetooth) {
		if ( bluetooth instanceof SamsugElec ) {
			bluetooth.connection();
		}
	}

}
