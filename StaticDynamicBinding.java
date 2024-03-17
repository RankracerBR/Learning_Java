public class StaticDynamicBinding {

    public static class superclass{
        static void print(){
            System.out.println("Print in superclass");
    }
    
}

    public static class subclass extends superclass{
        static void print(){
            System.out.println("Print in subclass");
        }
    }

    public static void main(String []args){
        main2(args);
        superclass sup = new superclass();
        subclass sub = new subclass();
        sup.print();
        sub.print();
    }

    public static class superclass2{
        void print(){
            System.out.println("Print in superclass2");
        }
    }

    public static class subclass2 extends superclass2{
        @Override
        void print(){
            System.out.println("print in subclass2");
        }
    }

    public static void main2(String []args){
        superclass2 sup2 = new superclass2();
        subclass2 sub2 = new subclass2();
        sup2.print();
        sub2.print();
    }

}
