## The * operator ##


### Declaring a pointer ###
The following code demonstrates two means of declaring a pointer:

    ```cpp
    int *p;
        // OR
    int* p;
    ```

    In this case the * means that the variable `p` will refer to thespecific  memory 
    address of an integer value[2].


### Dereferencing ###
This is a unary operator and can be thought of as the complement of the 
&(Address of) operator. It return the value located at the operands memory address

Example: [task123.cpp:line 28]

## The &(Address of) operator ##
This is a unary operator and returns the memory address of the operand specified [1].

Example: [task123.cpp:line 20,21]

## Pointer VS Reference ##

    * A reference alway refers to an object, However pointers can be set to `null`.

    * A pointer can be re-assigned any number of times while a reference cannot be           re-assigned after binding.
    
    * References cannot be stored in an array, but pointers can.

    * pointers can pointer to other pointers allowing for a deeper level of indirection  if needed but references have a single level due to its binding to an object.

    * Dereferencing is required with pointers in order to access the value at the memory location, whereas a reference can be used directly



[1] - http://www.c4learn.com/cplusplus/cpp-pointer-operator/
[2] - https://www.programiz.com/cpp-programming/pointers
[3] - https://stackoverflow.com/questions/57483/what-are-the-differences-between-a-pointer-variable-and-a-reference-variable-in - Brian R. Bondy 