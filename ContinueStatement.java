public class ContinueStatement {
    public static void main(String []args){
        main2();
        main3();
        main4();
        main5();
        for(int i=1;i<=5;i++){
            if(i==2){
                continue;
            }
            System.out.println(i);
        }
    }
    
    public static void main2(){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    continue;
                }
                System.out.println(i+" "+j);
            }
        }   
    }

    public static void main3(){
        xy:
        for(int i=1;i<=3;i++){
            xz:
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    continue xy;
                }
                System.out.println(i+" "+j);
            }
        }
    }

    public static void main4(){
        int i=1;
        while(i<=5){
            if(i==2){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }

    public static void main5(){
        int i=1;
        do{
            if(i==3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }while(i<=10);
    }

}
