package day29interfaceManipulations;

public class Runner {
    public static void main(String[] args) {

        HybridEngine hybridEngine = new Car();

        hybridEngine.havingHybridEngine();

        Car car=new Car();
        car.electronicAc();
        car.move();
        car.climateAc();


    }
}
