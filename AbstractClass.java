public abstract class AbstractClass {
    private String name;
    private String address;
    private int number;

    public AbstractClass(String name, String address, int number){
        System.out.println("Constructing an Student");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public double computePay(){
        System.out.println("Inside AbstractClass computePay");
        return 0.0;
    }

    public void mailCheck(){
        System.out.println("Mailing a check to "+ this.name + " "+ this.address);
    }

    public String toString(){
        return name + " " + address + " " + number;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String newAddress){
        address = newAddress;
    }

    public int getNumber(){
        return number;
    }
}


abstract class Shapes{
    abstract void draw();
}
class Rect extends Shapes{
    void draw(){
        System.out.println("Draw rectangle");
    }
}
class Circle extends Shapes{
    void draw(){
        System.out.println("Draw Circle");
    }
}
class DemoAbstraction{
    public static void main(String []args){
        Shapes s = new Circle();
        s.draw();
    }
}


abstract class Bank{
    abstract int getRateOfInterest();
}
class ICICI extends Bank{
    int getRateOfInterest(){
        return 5;
    }
}
class HDFC extends Bank{
    int getRateOfInterest(){
        return 6;
    }
}
class TestBank{
    public static void main(String []args){
        Bank b;
        b = new ICICI();
        System.out.println("Rate of Interest ICICI: "+ b.getRateOfInterest()+"%");
        
        b = new HDFC();
        System.out.println("Rate of Interest HDFC: "+b.getRateOfInterest()+"%");
    }
}


abstract class Bike{
    Bike(){
        System.out.println("Bike is created");
    }
    abstract void run();
    void changeGear(){
        System.out.println("Gear changed");
    }
}

class Hero extends Bike{
    void run(){
        System.out.println("Running Safely...");
    }
}

// class TesAbstract{
//     public static void main(String []args){
//         Bike obj = new Hero();
//         obj.run();
//         obj.changeGear();
//     }
// }