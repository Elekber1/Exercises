package test.car;

public class BMW extends AbstractCar {

    @Override
    public void drive() {
        System.out.println("BMW started to drive");
    }

    @Override
    public void stop() {
        System.out.println("BMW stoped ");
    }

    @Override
    public void park() {
        System.out.println("BMW parked");
    }
    @Override
    public void alert(){
        System.out.println("BMW is alerting you");
    }
}
