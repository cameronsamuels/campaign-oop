## Campaign OOP in Java
This set of classes represents political campaigns in the United States.
This can practically be used in a data management application
to store data on a single political campaign, a particular political race,
or a collection of political campaigns from one race to many races.

This project was built for Google Code-in 2019 (task sponsored by [JBoss](http://jboss.org)).

## Description of OOP
- **Encapsulation** - This project uses encapsulation to restrict the modification of
instance variables that should remain the same throughout the object's existence.
This helps keeps consistency and permanency to effectively achieve the purpose of the classes.
- **Inheritance** - This project mainly uses inheritance in the structuring of divisions.
A division inherits methods and variables from the abstract `Division` class
to enable generic data to maintain consistent throughout the types of divisions.
- **Polymorphism**
  - **Compile-time** - This project contains overridden constructors to provide
  easier initialization of objects.
  - **Runtime** - This project uses late binding in the `contains()` method in `State` and `District` objects.
  This allows `State` objects to determine whether a district is contained inside the state,
  or in `District` objects if they are equal. The only disadvantage to this is
  the equivalence of `contains()` and `equals()` in `District` objects.
- **Abstraction** - This project mainly uses abstraction in the abstract class `Division`.
This allows for divisions to contain default data such as `population` and `numVoters`
while allowing for each division to still be of the type of division it is: `State`, `District`, or `Country`.
