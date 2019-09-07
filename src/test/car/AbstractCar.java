package test.car;

public abstract class AbstractCar {

    public void stopAndAlert(){
       stop();
       alert();
    }
    public void CarSpeed(){
        System.out.println("Car is driving by 100km/h");
    }
    public abstract void drive();
    public abstract void stop();
    public abstract void park();
    public abstract void alert();

}
