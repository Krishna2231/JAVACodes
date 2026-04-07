import java.time.*;
import java.time.format.*;
import java.time.temporal.*;
import java.time.chrono.*;
import java.util.*;
import java.time.zone.*;
import java.time.LocalDateTime;


public class DateHandlingPrograms {
    public static void main(String[] args)
    {
LocalDate ld=LocalDate.now();
LocalTime lt=LocalTime.now();
ZonedDateTime timez=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
LocalDateTime ldt=LocalDateTime.now();

System.out.println("LocalDate is :"+ ld);
System.out.println("Localtime is  :"+ lt);
System.out.println("Current zoid is is :"+ timez);
System.out.println("LocalDatetime is :"+ ldt);
System.out.println("\n================ Formatting Dates ===========");
DateTimeFormatter fmt1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
DateTimeFormatter fmt2=DateTimeFormatter.ofPattern("yyyy/MM/dd");
DateTimeFormatter fmt3=DateTimeFormatter.ofPattern("yyyyMMdd");
DateTimeFormatter fmt4=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
System.out.println("Original LocalDate format is  :"+ ld);
System.out.println("The Local date is in dd-MM-yyyy :"+ld.format(fmt1));
System.out.println("The LocalDate is in yyyy/MM/dd :"+ld.format(fmt2));
System.out.println("The Localdate is in yyyyMMdd :"+ld.format(fmt3));
System.out.println("The LocalDate is in dd-MM-yyyy HH:mm:ss :"+ldt.format(fmt4));
long n=Integer.parseInt(ld.format(fmt3));
System.out.println("LolalDate is converted into integer : "+n);

System.out.println("\n=== =============Parsing Dates============ ===");
String StrDate1="25/12/2025";
String StrDate2="2025-08-15T10:30:00";

LocalDate Ld2=LocalDate.parse(StrDate1,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
LocalDateTime LDT2=LocalDateTime.parse(StrDate2);

System.out.println("Parsed Local Date is : "+Ld2);
System.out.println("Parsed Local Date Time is : "+LDT2);

  System.out.println("\n=== =========Date Arithmetic ===========");
  LocalDate nextWeek=ld.plusWeeks(1);
  LocalDate lastMonth=ld.minusMonths(1);
  LocalDateTime ldtx=dateTime.plusMinutes(90);

  System.out.println("NextWeek is from today :"+nextWeek);
System.out.println("lastMonth is from today :"+lastMonth);
System.out.println("Next year is from today is :"+ld.plusYears(1));
System.out.println("Time in 90 mins : "+ ldtx);
    }
    
}
