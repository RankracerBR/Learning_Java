public class Strings {
    public static void main(String []args){
        main2();
        main3();
        main4();
        char[] helloArr = {'h','e','l','l','o','.'};
        String helloStr = new String(helloArr);
        System.out.println( helloStr );
    }

    public static void main2(){
        String str = "Welcome to the world of Java Tutorial";
        int length = str.length();
        System.out.println("Total String Length = "+length);
    }

    public static void main3(){
        String str1 = "Java ";
        System.out.println("Welcome to the world of "+ str1 + "Tutorial");
    }

    public static void main4(){
        String name="Phptpoint";
        String s1 = String.format("Name = %s",name);
        String s2 = String.format("Value = %f",32.33434);
        String s3 = String.format("Value = %32.12f",32.33434);
    
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }

}
