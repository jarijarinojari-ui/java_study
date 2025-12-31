package _1230.design.factory;

import _1230.design.factory.ext.A;
import _1230.design.factory.ext.B;
import _1230.design.factory.ext.C;

public class FactoryImpl {
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
