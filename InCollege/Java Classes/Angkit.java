//creating the interface part

interface InterfaceOne{
    public void updateGear(int newGear);
}
interface InterfaceTwo{
    public void accelerate(int accelerate);
}
interface InterfaceThree{
    public void pushBrake(int brake);
}
//creating the car class
//this is implementation for car class
class Car implements InterfaceThree, InterfaceOne, InterfaceTwo{
    private int acceleration;
    private int brakeValue;
    private int Gear;

    @Override
    public void updateGear(int newNum) {
        this.Gear=newNum;
//        System.out.println("Near Gear is "+ newNum);

    }
    //creating getters
    public int getGear(){
        return Gear;
    }

    @Override
    public void accelerate(int accelerate) {
        this.acceleration=accelerate;
    }

    //getter for acceleration
    public int getAcc(){
        return acceleration;
    }

    @Override
    public void pushBrake(int brake) {
     this.brakeValue=brake;
    }

    public int getBrake(){
        return  brakeValue;
    }
    //setter for current speed


    public int getCurrentSpeed(){
        return acceleration-brakeValue;
    }


}

class Truck implements InterfaceThree, InterfaceOne, InterfaceTwo{
    private int acceleration;
    private int brakeValue;
    private int Gear;

    @Override
    public void updateGear(int newNum) {
        this.Gear=newNum;
//        System.out.println("Near Gear is "+ newNum);

    }
    //creating getters
    public int getGear(){
        return Gear;
    }

    @Override
    public void accelerate(int accelerate) {
        this.acceleration=accelerate;
    }

    //getter for acceleration
    public int getAcc(){
        return acceleration;
    }

    @Override
    public void pushBrake(int brake) {
     this.brakeValue=brake;
    }

    public int getBrake(){
        return  brakeValue;
    }
    //setter for current speed


    public int getCurrentSpeed(){
        return acceleration-brakeValue;
    }


}





public class Angkit {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.updateGear(2);
        c1.accelerate(2);
        c1.pushBrake(4);

        System.out.println(STR."Car Present State: \nBrake: \{c1.getBrake()}");
        System.out.print(STR."Speed: \{c1.getCurrentSpeed()}");
        System.out.println(STR." gear: \{c1.getGear()}");

        System.out.println();

        Truck t1=new Truck();
        t1.updateGear(2);
        t1.accelerate(2);
        t1.pushBrake(4);

        System.out.println(STR."Truck Present State: \nBrake: \{t1.getBrake()}");
        System.out.print(STR."Speed: \{t1.getCurrentSpeed()}");
        System.out.println(STR." gear: \{t1.getGear()}");

    }
}
