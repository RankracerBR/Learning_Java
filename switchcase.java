public class switchcase {
    public static void main(String []args)
    {
        main2();
        int num =2;

    switch(num)
        {
    case 1:
        System.out.println("Today is Monday");
    break;
    case 2:
        System.out.println("Today is Tuesday");
    break;
    case 3:
        System.out.println("Today is Wednesday");
    default:System.out.println("Wrong choice");
    }
    }

    public static void main2(){
        char ch='E';
        switch(ch){
            case 'a':
                System.out.println("a is Vowel");
            break;
            case 'e':
                System.out.println("e is Vowel");
            break;
            case 'i':
                System.out.println("i is a Vowel");
            break;
            case 'o':
                System.out.println("o is Vowel");
            break;
            case 'u':
                System.out.println("u is Vowel");
            case 'A':
                System.out.println("A is Vowel");
            break;
            case 'E':
                System.out.println("E is Vowel");
            break;
            case 'I':
                System.out.println("I is Vowel");
            break;
            case 'O':
                System.out.println("O is Vowel");
            break;
            case 'U':
                System.out.println("U is Vowel");
            break;
            default:
                System.out.println("Given Character is Consonant");
        }
    }
}


