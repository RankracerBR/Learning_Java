public class StarPattern {
    public static void main(String []args){
        main2();
        main3();
        main4();
        main5();
        main6();
        main7();
        main8();
        main9();
        main10();
        main11();
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
    public static void main7(){
        for(int i=0; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main8(){
        for(int i=5; i>=1; i--){
            if(i%2 !=0){
                for(int j=5; j>=i; j--){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    for(int i=2; i<=5; i++){
        if(i%2 !=0){
            for(int j=5; j>=i; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
  }

    public static void main9(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }

    public static void main10(){
        int x = 1;

        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print(x++);
            }
            System.out.println();
        }
    }

    public static void main11(){
        int x = 0;
        int j = 1;

        for(int i=1; i<=3; i++){
            while(x < 3){
                System.out.print(j++);
                x++;
            }
            x = 0;
        System.out.println();
        }
    }

}