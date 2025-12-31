package _1230.design.factory.impl;

import _1230.design.factory.impl.A;
import _1230.design.factory.impl.B;
import _1230.design.factory.impl.C;

public class Factory {
	A make (String name) {
		if ("B".equals(name)) {
			return new B(); 
		}
		if ("C".equals(name)) {
			return new C();
		}
		return null;
	}
}
