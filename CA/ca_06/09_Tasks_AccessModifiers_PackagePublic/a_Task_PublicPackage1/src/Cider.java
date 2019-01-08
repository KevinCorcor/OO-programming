package drinks;

import fruits.Apple;						// 01: required class

class Cider{ 								// package access
	Apple appleType;						// Apple class needs to be public

	Cider(){ 								// package access
		appleType = new Apple("coxes");		// Apple() must be public
	}


}
