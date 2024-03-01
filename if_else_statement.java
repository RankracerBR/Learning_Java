public class if_else_statement {
    public static void main(String []args)
    {
        main2();
        main3();
        main4();
        main5();
        main6();
        int num=10;

        if(num%2==0)
        {
            System.out.println("Given number is even no");
        }
    }

    public static void main2()
    {
        int num = 10;

        if (num%2==0)
        {
            System.out.println("Give number is even");
        }   
        else 
        {
            System.out.println("Given number is odd");
        }
    }

    public static void main3()
    {
        int num = 10;
        String result=(num%2==0)?"Given number is even":"Given number is odd";
        System.out.println(result);
    }

    public static void main4()
    {
        int day=3;

        if (day == 1)
        {
            System.out.println("Its monday");
        }
        else if (day == 2)
        {
            System.out.println("Its tuesday");
        }
        else if (day == 3)
        {
            System.out.println("Its wednesday");
        }
        else 
        {
            System.out.println("Invalid choice");
        }
    }

    public static void main5()
    {
        int num = 10;
        if(num>0)
        {
            System.out.println("Its Positive Number");
        }
        else if(num<0)
        {
            System.out.println("Its Negative Number");
        }
        else
        {
            System.out.println("Give number is zero");
        }
    }

    public static void main6()
    {
        int x=10;
        int y=15;
        if(x>=10)
        {
            if (y>=15){
                System.out.println("Welcome user");
            }
        }
    }
}
