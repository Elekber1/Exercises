package test.car;

public class Mercedes extends AbstractCar {

    @Override
    public void drive() {
        System.out.println("Mercedes started to drive");
    }

    @Override
    public void stop() {
        System.out.println("Mercedes stoped ");
    }

    @Override
    public void park() {
        System.out.println("Mercedes parked");
    }
    @Override
    public void alert(){
        System.out.println("Mercedes is alerting you");
    }
}
