package day29interfaceManipulations;

public interface AirCondition extends Vehicle {
    /*
    Interface is not a class but it is an interface
    A class should be able to use multiple interfaces as parents
    In an interface, most methods are abstract
    but we can still use some concrete methods that are static and default
    we do not need to use abstract key word for an ınterface (for interface name)
    if we use a variable in an interface, we need to assign a value
    İn abstract class we can have constructors, but in interface we cannot have constructors
    interface cannot have concrete methods other than default and static, bu abstract class can have concrete
    so in java, when we use final variables, the name of varibales should be written in uppercase


    */

    String MAKE="Samsung";

    public abstract void electronicAc();

    public void climateAc();

    void bacteriaKiller ();

    void run();

//    public default int power (){
//        System.out.println("  ");
//    }



















}
