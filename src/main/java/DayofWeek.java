import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayofWeek {
    public static void main(String[] args) {
        int month = 8;
        int day = 5;
        int year = 2022;
        if (year> 2000 && year<3000) {
            System.out.println(weekDay(month, day, year));
        }
        else{
            System.out.println("No Output");
        }
    }


    public static String weekDay(int month, int day, int year){
        LocalDate date =LocalDate.of(year, month, day);
        String dayOfWeek= date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH).toUpperCase();
        return dayOfWeek;
    }
}
