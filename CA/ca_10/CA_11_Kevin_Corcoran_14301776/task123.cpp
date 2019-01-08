/*
The following code is adapted from [1] and has been modified in order to 
demonstrate the invocation of a copy constructor.
[1] - https://www.geeksforgeeks.org/copy-constructor-in-cpp/
*/

#include<iostream> 
using namespace std; 

class Point 
{ 
    public: 
        int x, y; // made these public for the purpose of demonstration
    
        Point(int x1, int y1) { x = x1; y = y1; } 

        // Copy constructor 
        Point(const Point &p) {x = p.x; y = p.y; } 

        int* getX() { return &x; } 
        int* getY() { return &y; } 
}; 

// ********************************************Pass by value and return by value example method*******************************************************
Point PassAndReturnByValue(Point p3){
    cout << "\n\nThe following is an example of pass by value invocation of the copy constructor";
    p3.x = 222;
    cout << "\n\tp3 object : " << &p3 << ", p3.x = "<< *p3.getX() <<"->" << p3.getX() << ", p3.y = "<< *p3.getY() << "->" << p3.getY(); 
    return p3;
};

int main() 
{ 
	Point p1(10, 15); // Normal constructor invocation
	cout << "inital object:"; 

	cout << "\n\tp1 object : " << &p1 << ", p1.x = "<< *p1.getX() << "->" << p1.getX() << ", p1.y = "<< *p1.getY() << "->" << p1.getY(); 

    //****************************************Copy constructor invocation****************************************
	Point p2 = p1;  


	p2.x=111;   //change value to show objects to not share references
	
	cout << "\nCopy constructor object: with changed value, alongside inital object"; 
    cout << "\n\tp2 object : " << &p2 << ", p2.x = "<< *p2.getX() <<"->" << p2.getX() << ", p2.y = "<< *p2.getY() << "->" << p2.getY(); 
	cout << "\n\tp1 object : " << &p1 << ", p1.x = "<< *p1.getX() << "->" << p1.getX() << ", p1.y = "<< *p1.getY() << "->" << p1.getY(); 

    
    Point p4 = PassAndReturnByValue(p2);

    cout << "\n\nThe following is an example of return by value invocation of the copy constructor";
    //Note the pointers have different values
    cout << "\n\tp4 object : " << &p4 << ", p4.x = "<< *p4.getX() <<"->" << p4.getX() << ", p4.y = "<< *p4.getY() << "->" << p4.getY();

	return 0; 
}
