public class BreakStatement {
    public static void main(String []args){
        main2();
        main3();
        main4();
        main5();
        for(int i=1; i<=10; i++){
            if(i==4){
                break;
            }
            System.out.println(i);
        }
    }

    public static void main2(){
        for(int i=1;i<=2; i++){
            for(int j=1; j<=2; j++){
            if(i==1 && j==1){
                break;
            }
            System.out.println(i+" "+j);    
        }
        }
    }

    public static void main3(){
        xy:
        for(int i=1; i<=2; i++){

        xz:
        for(int j=1; j<=2; j++){
            if(i==2 && j==2){
                break xy;
            }
            System.out.println(i+" "+j);
        }
    }
    }

    public static void main4(){
        int i=1;
        while(i<=15){
            if(i==3){
                i++;
                break;
            }
            System.out.println(i);
            i++;
        }
    }

    public static void main5(){
        int i = 1;
        do{
            if(i==3){
                i++;
                break;
            }
            System.out.println(i);
            i++;
        } while(i<=15);
    }

}
