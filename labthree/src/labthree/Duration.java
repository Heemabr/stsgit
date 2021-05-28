package labthree;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Duration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String date=sc.nextLine();
DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate s  = LocalDate.now();
		System.out.println("Current Date " + s);
		LocalDate Ld = LocalDate.parse(date, format);
        System.out.println(Ld);
        
        Period diff = Ld.until(s);
        
        System.out.println("Years : "+diff.getYears());
        System.out.println("Months : "+diff.getMonths());
        System.out.println("Days: "+diff.getDays());
	}

}
