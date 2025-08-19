import java.time.LocalDate;
import java.time.DayOfWeek;

public class Calender{
	public static void main(String[] args){
		int day = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);

		LocalDate date = LocalDate.of(year, month, day);
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		System.out.println("The Day for given date is : " + dayOfWeek);
	}
}