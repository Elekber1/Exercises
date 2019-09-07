package reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class addTime {

    public static void main(String[] args) {

        boolean result1 = false;
        boolean result2 = false;
        boolean result = false;

        try{
            String string1 = "10:00";
            Date time1 = new SimpleDateFormat("HH:mm").parse(string1);
            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(time1);

            String string2 = "11:00";
            Date time2 = new SimpleDateFormat("HH:mm").parse(string2);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(time2);
            calendar2.add(Calendar.DATE, 1);

            String someRandomStartTime = "12:00";
            Date d1 = new SimpleDateFormat("HH:mm").parse(someRandomStartTime);
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTime(d1);
            calendar3.add(Calendar.DATE, 1);
            Date x1 = calendar3.getTime();

            String someRandomEndTime = "13:00";
            Date d2 = new SimpleDateFormat("HH:mm").parse(someRandomEndTime);
            Calendar calendar4 = Calendar.getInstance();
            calendar4.setTime(d2);
            calendar4.add(Calendar.DATE, 1);
            Date x2 = calendar4.getTime();

            if (x1.after(calendar1.getTime()) && x1.before(calendar2.getTime())) {
                //checkes whether the current time is between 14:49 and 20:11.

            }else{
                result1 = true;
            }
            if (x2.after(calendar1.getTime()) && x2.before(calendar2.getTime())) {
                //checkes whether the current time is between 14:49 and 20:11.
            }else{
                result2 = true;
            }

            if(result1 && result2){
                result = true;
            }
            System.out.println(" : "+result);

            }catch (ParseException e){
                e.printStackTrace();
        }

    }
}
