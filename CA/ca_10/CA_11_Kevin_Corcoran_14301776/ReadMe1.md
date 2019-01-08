

A copy construct is a member function which initialises 
another object of the same class and generally has the following 
structure [1]: 
    
    ClassName (const ClassName &initial_obj);

A member function is an operator or function of a class is one which was declared within that class. These can be static and non static but not 'friend'[2].

Copy contructors can be invoked in several ways[1]:

1: Invocation via an object of a class being return 'by value'
----------------SEE task123.cpp----------------------

2: Invocation via an object of a class being passed by value
----------------SEE task123.cpp----------------------

3: Invocation by the constuction of a new object based on an old one
----------------SEE task123.cpp-----------------------

4: Invocation by the compiler creating a temporary object


Note: invocation of the copy constructor is not gaurunteed in each of
the above statements since the compilier may avoid it for optimisation purposes.

It is also worth noting that if it is the case that a new object is being created 
from an existing object, then the copy constructor is called, whereas if a currently existing object is being initalised with another existing object the assignment operator is called.

```cpp
    MyClass t1, t2; 
    MyClass t3 = t1;  // -----> copy constructor
    t2 = t1;          // -----> assignment operator
```

[1] - https://www.geeksforgeeks.org/copy-constructor-in-cpp/
[2] - https://www.ibm.com/support/knowledgecenter/en/SSLTBW_2.3.0/com.ibm.zos.v2r3.cbclx01/cplr027.htm




