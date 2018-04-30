import java.time.*;
import java.time.format.*;

/**
 * This is a class to demonstrate how to retrieve date and time from the
 * computer.
 * 
 * @author Daniel Montoya
 *
 */
public class DateAndTime {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // this prints out the local time and date
    LocalDate localDate = LocalDate.now();
    LocalTime time = LocalTime.now();
    System.out.println(time);
    System.out.println(localDate);

  }

}
