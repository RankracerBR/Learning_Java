public class StarPattern {
    public static void main(String []args){
        main2();
        main3();
        main4();
        main5();
        main6();
        for(int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main2(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main3(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main4(){
        for(int i=1; i<=5; i++){
            for(int k=5; k>i; k--){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
        System.out.println();
        }
        
    }
    public static void main5(){
        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main6(){
        for(int i=0; i<=5; i++){
            for(int k=5; k>=i; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i=4; i>=1; i--){
            for(int k=5; k>=i; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
