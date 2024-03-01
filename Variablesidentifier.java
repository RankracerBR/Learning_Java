public class Variablesidentifier
{
    public static void main(String [] args){
        String str;
        str = "Hello World";
        System.out.println(str);
    }

}


class Page
{
    public String pageName;
    private int pageNumber;

}

class Demo
{
    static int x =test();

    static 
    {
        System.out.println("This is inside static block");
    }

    static int test()
    {
        System.out.println("Print from test");
        return 10;
    }

    public static void main(String []args)
    {
        System.out.println("Print the value of x: "+ x);
    }

    public static void main2(String []args)
    {
        int x =10;
        int y =10;
        int z =x+y;
        System.out.println(z);
    }

}

class Demo2
{
    public static void main(String []args){
        int num = 5;
        double num1 = num;
        System.out.println(num);
        System.out.println(num1);
    }

    // public static void main2(String[] args) 
    // {
    //   double num = 5.75;
    //   int num_int = num;
    //   System.out.println(num);   // Output 5.75
    //   System.out.println(num_int);// Outputs 5
    // }

}

class Demo3{
    public static void main(String []args)
    {
        int sum = 100 + 50;
        System.out.println(sum);
    }
}

