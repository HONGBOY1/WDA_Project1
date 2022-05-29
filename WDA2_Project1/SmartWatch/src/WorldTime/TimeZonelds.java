package WorldTime;

import java.util.TimeZone;

public class TimeZonelds {
    public static void main(String[] args) {
        String[] local = TimeZone.getAvailableIDs();
        for(int i=0; i<local.length; i++){
            System.out.println(local[i]);
        }
    }
}

