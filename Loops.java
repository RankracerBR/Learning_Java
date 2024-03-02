public class Loops {
    public static void main(String []args){
        main2();
        main3();
        main4();
        main5();
        main6();
        
        for(int i=1; i<=15; i++){
            System.out.print(i);
        }
    }
    public static void main2(){
        for(int i=1; i<=100; i++){
            if(i%2==0){
                System.out.print(i);
            }
        }
    }

    public static void main3(){
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main4(){
        for(int i=1; i<=3; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main5(){
        int array[] = {10,11,12,13,14,15};
        for(int i:array){
            System.out.print(i+" ");
        }
    }

    public static void main6(){
        for(;;){
            System.out.println("Statement will print infinitive times");
        }
    }
}
