package day29interfaceManipulations;

public class Tesla extends ElectiricalVehivles {


    @Override
    public void climateAc() {
        System.out.println("The Tesla AC presents..");
    }

    @Override
    public void run() {
        System.out.println("Tesla run performance..");
    }
}
