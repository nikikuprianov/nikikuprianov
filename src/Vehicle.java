public class Vehicle {
    public Vehicle(){
        model = "BMW";
        maxspeed = 500;
        isDieselFuel = false;
        fuel = 0;
    }
    String model;
    int maxspeed;
    boolean isDieselFuel;
    int fuel;


    public String getModel(){
        return model;
    }
    void drive() {
        fuel -= 90;
        System.out.println("Заводит....");
    }
    void stop(){
        fuel = fuel;
        System.out.println("*Едет*");
    }
    void refuel(){
        fuel = 100;
        System.out.println("*Заправляется*");
    }


    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();

    }
}
