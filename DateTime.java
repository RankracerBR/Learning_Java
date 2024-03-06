import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String []args){
        main2();
        main3();
        main4();
        LocalDate CurrDate = LocalDate.now();
        System.out.println(CurrDate);
    }

    public static void main2(){
        LocalTime CurTime = LocalTime.now();
        System.out.println(CurTime);
    }

    public static void main3(){
        LocalDateTime CurDateTime = LocalDateTime.now();
        System.out.println(CurDateTime);
    }

    public static void main4(){
        LocalDateTime myDateTimeObj = LocalDateTime.now();
        System.out.println("Display Date tim Before formatting: "+myDateTimeObj);
        DateTimeFormatter myDateTimeFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        String formattedDateTime = myDateTimeObj.format(myDateTimeFormatObj);
        System.out.println("Display Date time After formatting: "+formattedDateTime);
    }
}
