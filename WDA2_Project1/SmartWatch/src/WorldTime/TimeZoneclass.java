package WorldTime;
import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneclass {

    Calendar cal = Calendar.getInstance();

    TimeZone zone = TimeZone.getTimeZone("Europe/London");
    cal.setTimeZone(zone);
    System.out.println("유럽/런던의 시간:"+cal.get(Calendar.HOUR)+"시"+cal.get(Calendar.MINUTE)+"분"+cal.get(Calendar.SECOND)+"초");

    
}
