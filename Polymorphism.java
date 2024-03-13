class Adder{
    static int add1(int a, int b){
        return a + b;
    }

    static int add2(int a, int b, int c){
        return a + b + c;
    }
}

class TestOverLoading1{
    public static void main(String []args){
        System.out.println(Adder.add1(11, 11));
        System.out.println(Adder.add2(11, 11, 11));
    }
}

class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}

class Bike2 extends Vehicle{
    void run(){
        System.out.println("Bike is running safely");
    }

    public static void main(String []args){
        Bike2 obj = new Bike2();
        obj.run();
    }

}