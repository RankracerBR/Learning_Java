class Adder{
    static int add1(int a, int b){
        return a + b;
    }
    static double add2(double a, double b){
        return a + b;
    }
}


class TestOverLoading2{
    public static void main(String []args){
        System.out.println(Adder.add1(11,11));
        System.out.println(Adder.add2(12.3, 12.6));
    }
}

class Adder2{
    static int add1(int a, int b){
        return a + b;
    }
    static int add2(int a, int b, int c){
        return a + b + c;
    }
}

class TestOverLoading1{
    public static void main(String []args){
        System.out.println(Adder2.add1(11, 11));
        System.out.println(Adder2.add2(11, 11, 11));
    }
}

class Adder3{
    static int add1(int a, int b){
        return a + b;
    }
    static double add2(int a, int b){
        return a + b;
    }
}

class TestOverLoading3{
    public static void main(String []args){
        System.out.println(Adder3.add1(11,11));
    }
}