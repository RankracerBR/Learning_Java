public class switchcase {
    public static void main(String []args)
    {
        main2();
        main3();
        main4();
        main5();
        main6();
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
        switch(ch)
        {
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
    public static void main3(){
        int num=5;
        switch(num)
        {
            case 5:
                System.out.println("5");
            break;
            case 10:
                System.out.println("10");
            break;
            case 15:
                System.out.println("15");
            break;
            default:
                System.out.println("Its not 5,10,15");
        }
    }

    public static void main4(){
        String levelStr="Fresher";
        int lev=0;
        switch(levelStr)
        {
        case "Fresher":
            lev=1;
        break;
        case "Intermidiate":
            lev=2;
        break;
        case "Experts":
            lev=3;
        break;
        default:
            lev=0;
        break;
        }
        System.out.println("You are: "+lev);
    }

    public static void main5(){
    String sandwich = "Chicken";
    String fill_type = "Tomato";

    switch (sandwich){
        case "Chicken":
            System.out.println("This is a Chicken Sandwich");
        break;
        case "Paneer":
            System.out.println("This is Paneer Sandwich");
        break;
        case "Veg":
         switch(fill_type){
            case "Tomato":
                System.out.println("This is");
            break;
            case "Eggplant":
                System.out.println("This is eggplant filling Sandwich");
            break;
            case "Swiss cheese":
                System.out.println("This is Swiss filling Sandwich");
            break;
            default:
                System.out.println("Sandwich Choice was not Chicken, Paneer or Veg");
         }
      }
   }

    public static void main6(){
        Integer ag = 62;

        switch(ag){
            case (12):
                System.out.println("You are underage");
            break;
            case (18):
                System.out.println("Congrats you are elegible");
            break;
            case (62):
                System.out.println("Senior Citizen");
            break;
        }

   }

}



