package day29interfaceManipulations;

public interface Vehicle {
    /*
    Interface uses abstract key word for Interface name
	No need for abstract key word
	Interface can have constructor
	No and no need to try to initialize variables as they are final
	Abstract class needs abstract key word
	yes
	Abstract class can have concrete and abstract methods
	yes
	Abstract class can have constructors
	abstract class can have final, static, private variables
	yes
	Interface can have final, static, public variables
	yes
	Interface can have default, private protected variables
	no
	Interface can have concrete methods other than default and static
	Interface and abstract class cannot create objects
	yes
	Difference between an Interface and abstract class?
	Interface cannot have any constructor, but abstract class can have constructors
	Interface can be implemented many times(multiple inheritance) , but Abstract classs cannot have multiple Inheritance.
	Interface is fullly abstraction and cannot use all concrete methods, but Abstract class has  asbtract methods and concrete methods
	difference between an Abstract class and a concrete class?
	Concrete class can produce Object, but we cannot create Object from abstract class
	Concrete class has concrete methods, but Abstract class has concrete and abstract methods
	try catch
	throws exeption
	what is the biggest difference between try catch block and throws Exception?
	when we use try catch block, we can apply it mostly to utilities as we will not have to handle it again,
	 but when we use throws Exception, we can use it only when we need to use it once in a method signature(It can be test or development level).
     */

    public default void move(){
        System.out.println("All vehicles should move..");

    }

    public static void staticMove(){
        System.out.println("All vehicles should move better..");
    }


}
