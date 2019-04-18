import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateDemo {
    public static void main(String[] args){
        String st = "2019年03月23日";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        LocalDate date = LocalDate.parse(st,dateTimeFormatter);
        System.out.println(date);

        LocalTime now = LocalTime.now();
        System.out.println(now);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
    }
}
