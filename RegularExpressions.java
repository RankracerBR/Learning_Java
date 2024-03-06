import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String []args){
        main2();
        main3();
        main4();
        main5();
        String line = "This order was placed for QT300! OK?";
        String pattern = "(.*)(\\d+)(.*)";

        Pattern r = Pattern.compile(pattern);
    
        Matcher m = r.matcher(line);
        if(m.find()){
            System.out.println("Found value: "+ m.group(0));
            System.out.println("Found value: "+ m.group(1));
            System.out.println("Found value: "+ m.group(02));            
        }else {
            System.out.println("NO MATCH");
        }       
    }    

    private static final String REGEX = "\\bPHP\\b";
    private static final String INPUT = "PHP PHP PHPTPOINT Python PHP";

    public static void main2(){
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);
        int count = 0;

        while(m.find()){
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+m.start());
            System.out.println("end(): "+m.end());
        }
    }

    private static final String REGEX2 = "PHP";
    private static final String INPUT2 = "PHPTPOINT";
    private static Pattern pattern;
    private static Matcher matcher;

    public static void main3(){
        pattern = Pattern.compile(REGEX2);
        matcher = pattern.matcher(INPUT2);

        System.out.println("Current REGEX is: "+REGEX2);
        System.out.println("Current INPUT is: "+INPUT2);

        System.out.println("lookingAt(): "+matcher.lookingAt());
        System.out.println("matches(): "+matcher.matches());
    }

    private static String REGEX3 = "Python";
    private static String INPUT3 = "Python is the best language. "+ "I love Python.";
    private static String REPLACE3 = "Java";

    public static void main4(){
        Pattern p = Pattern.compile(REGEX3);

        Matcher m = p.matcher(INPUT3);
        INPUT3 = m.replaceAll(REPLACE3);
        System.out.println(INPUT3);
    }

    private static String REGEX4 = "a*b";
    private static String INPUT4 = "aabJerryaaabJerryabJerrybb";
    private static String REPLACE4 = "*";

    public static void main5(){
        Pattern p = Pattern.compile(REGEX4);
    
        Matcher m = p.matcher(INPUT4);
        StringBuffer sb = new StringBuffer();
    
        while(m.find()){
            m.appendReplacement(sb, REPLACE4);
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }


}
