public class MethodsParameters {
    public static void DemoMethod(String name){
        System.out.println(name + " kumar ");
    }

    public static void main(String []args){
        main2();
        main3();
        main4();
        DemoMethod("Sanjeev");
        DemoMethod("Abhishek");
    }


    public static void DemoMethod2(String name, String profile){
        System.out.println("Name: "+name + " Profile: "+profile);
    }

    public static void main2(){
        DemoMethod2("Sanjeev", "Developer");
        DemoMethod2("Shipra", "Web Designer");
    }


    static int DemoMethod3(int a){
        return 10 + a;
    }


    public static void main3(){
        System.out.println(DemoMethod3(5));
    }


    static int DemoMethod4(int a, int b){
        return a + b;
    }


    public static void main4(){
        System.out.println(DemoMethod4(10, 5));
    }


    static int DemoMethod5(int a, int b){
        return a + b;
    }

    public static void main5(){
        int c = DemoMethod5(10, 5);
        System.out.println(c);
    }


    static void checkEvenOdd(int num){
        if(num > 0){
            System.out.println("Given number is even");
        }else{
            System.out.println("Given number is odd");
        }
    }
    
    public static void main6(){
        checkEvenOdd(10);
    }
}
