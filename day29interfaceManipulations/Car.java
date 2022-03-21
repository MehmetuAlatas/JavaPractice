package day29interfaceManipulations;

public class Car implements AirCondition, HybridEngine {


    @Override
    public void electronicAc() {
        System.out.println("The car AC is electronic..");
    }

    @Override
    public void climateAc() {
        System.out.println("The car AC is climate AC..");
    }

    @Override
    public void bacteriaKiller() {
        System.out.println("The car AC kills 99%percent of the bacteria..");
    }

    @Override
    public void run() {
        System.out.println("The car AC runs perfectly..");
    }

    @Override
    public void havingHybridEngine() {
        System.out.println("The car is hybrid..");
    }
}
