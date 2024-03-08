class Main{
    int x;
    int y;

    Main(int x, int y){
        this.x = x;
        this.y = y;
    }
    void display(){
        System.out.println("x = "+x + " y = "+y);
    }
    public static void main(String []args){
        Main object = new Main(10, 20);
        object.display();
        }
}
    
class Main2{
    int x;
    int y;

    Main2(){
        this(10, 20);
        System.out.println("Inside default constructor \n");
    }

    Main2(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("Inside parameterized constructor");
    }

    public static void main(String []args){
        Main2 object = new Main2();
    }

}

class Main3{
    int x;
    int y;

    Main3(){
        x = 100;
        y = 200;
    }

    Main3 get(){
        return this;
    }

    void display(){
        System.out.println("x =" + x + " y ="+ y);
    }

    public static void main(String []args){
        Main3 object = new Main3();
        object.get().display();
    }

}

class Main4{
    int x;
    int y;

    Main4(){
        x = 10;
        y = 20;
    }

    void display(Main4 obj){
        System.out.println("x = "+ x + "y = "+ y);
    }

    void get(){
        display(this);
    }

    public static void main(String []args){
        Main4 object = new Main4();
        object.get();
    }

}

class Main5{
    void display(){
        this.show();

     System.out.println("Inside display function");
    }

    void show(){
        System.out.println("Inside show function");
    }

    public static void main(String []args){
        Main5 t1 = new Main5();
        t1.display();
    }
}

class A{
    B obj;

    A(B obj){
        this.obj = obj;
    
        obj.display();
    }
}

class B{
    int x = 5;

    B(){
        A obj = new A(this);
    }

    void display(){
        System.out.println("Value of x in Class B: "+x);
    }

    public static void main(String []args){
        B obj = new B();
    }

}
