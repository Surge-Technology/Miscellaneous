package BasicsProto;

public class SwitchProto {
	public static void main(String[] args)
    {
       int day = 7;
        String dayString;      
        switch (day)
        {
            case 1:  dayString = "Monday";
                     break;
            case 2:  dayString = "Tuesday";
                     break;
            case 3:  dayString = "Wednesday";
                     break;
            case 4:  dayString = "Thursday";
                   break;
            case 5:  dayString = "Friday";
                    break;
            case 6:  dayString = "Saturday";
                     break;
            case 7:  dayString = "Sunday";
                     break;
            default: dayString = "Invalid day";
                     break;
        }
         System.out.println(dayString);
    }
}
