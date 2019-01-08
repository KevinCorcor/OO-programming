
Using the key word 'new' is coding to an implementation so it 
is always related to a concrete class, thus our class is not 
closed for modification.

Also, since we are coding to implementation, when modifications 
are made all instantiations throughout the code must be changed.

Coding to an interface is preferable.

Simple Factory
By outsourcing the code which builds the instances and varys into 
a separate class we can achieve a much more flexible design.

for example: 
The Java code in '01_SimpleFactory' has encapsulated the code 
which builds the instances into a separate class called 
'SimplePizzaFactory.java'.

    Encapsulated code now in SimplePizzaFactory.java:
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } 
    Access through common interface PizzaStore.java
        pizza = factory.createPizza(type);

This means objects can now be created without exposing the 
instantiation logic to the client.
Now the client refers to the newly created objects through a 
common interface(SimplePizzaFactory).
The SimplePizzaFactory is the only part of our code which refers to
the concrete pizza classes.


Factory Method (removed toppings)
Sticking with the pizza analogy this allows us to franchise our pizza 
store into different sreas requiring slightly different pizza styles.


This differs from the Simple Factory since here the subclasses of
the factory decide which class to instantiate.

Below we make a factory for NY style pizza and similarly a factory for
Chicago style pizza immediately after. we then assign those object references to 
PizzaStore references.

(in PizzaTestDrive.java)
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();

Next we order a pizza using the orderPizza method defined in the PizzaStore abstract 
class
    
    Pizza pizza = nyStore.orderPizza("cheese");
        --> public Pizza orderPizza(String type) {
		        Pizza pizza = createPizza(type);	//**HERE 'createPizza(...)' 
                ....

            abstract Pizza createPizza(String item);

As seen above this uses an abstract method createPizza() but not on a factory object 
like it was in the SimpleFactory implementation.

now our factory method, being createPizza() is abstract, meaning one of the subclasses
(ny or chicago) will be called in order to create the pizza.

Its worth noting that since PizzaStore is now abstract, so orderPizza() does not know which 
subclass(concrete class) is running its code(decoupled).

In orderPizza()
createPizza() calls into action a subclass based on the which store was used for the order.

So the subclasses can decide how they create their pizza.




Abstract Factory (I did not successfully run this code)

From my understanding

we can know access concrete factories via a factory interface so we have an interface for 
creating a family of related objects, without explicitly specifying their classes.

The factory method uses inheritence to create a concreate product and 
subclasses decide which concrete product to use.

Wheras Abstract Factory contains one or more factory methods thus it creates concrete products
by composition of sort.



Resources:
https://vivekcek.wordpress.com/2013/03/17/simple-factory-vs-factory-method-vs-abstract-factory-by-example/
https://web.cs.dal.ca/~jin/3132/lectures/dp-07.pdf
https://web.cs.dal.ca/~jin/3132/lectures/dp-08.pdf
https://www.u-cursos.cl/usuario/f133dab21b6cbf814b4607124f431358/mi_blog/r/head_first_design_patterns.pdf




