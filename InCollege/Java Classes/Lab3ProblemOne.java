//first task is to create interface:) ok

interface Polygon{
    double getArea();
    int getSides();
}


//first gonna create implementation for rectangle class

class Rectangle implements Polygon{
//    @Override

    //class level variables
    private double length;
    private double width;
//constructor
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
//getter
    public double getArea() {
        return length*width;
    }
//getter
    @Override
    public int getSides() {
        return 4;
    }
}
//now it's time for square
class Square implements Polygon{
    //class level variables
    private double length;
    //constructor
    public Square(double length){
        this.length=length;
    }
    @Override
    //getter
    public int getSides() {
        return 4;
    }

    @Override
    //getter
    public double getArea() {
        return length*length;
    }
}

public class Lab3ProblemOne {
    //main class
    public static void main(String[] args) {
    Square S1=new Square(9);
    Rectangle R1=new Rectangle(9,8);
        System.out.println("the area of S1 is "+ S1.getArea());
        System.out.println("S1 has "+S1.getSides()+ " sides");
        System.out.println("the area of R1 is "+ R1.getArea());
        System.out.println("R1 has "+R1.getSides()+" sides.");
    }
}
