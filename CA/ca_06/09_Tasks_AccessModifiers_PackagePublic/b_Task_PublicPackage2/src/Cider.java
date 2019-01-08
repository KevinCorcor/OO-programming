package drinks;

import fruits.Fruit;                    // 01: for appletype ref
import fruits.apples.Apple;             // 02: for new apple(...)

class Cider{            // package access

  Fruit appleType;      // public and accessible but needs import

  Cider(){              // package access
  	appleType = new Apple("coxes"); // needs to be imported and public
  	appleType.squeeze();             // does this work?, if method is made abstract
  }

}
