package frq.hwork;

public class APCalendar {

    private static boolean isLeapYear(int year) {
        if(year % 4 == 0) {
            return true;
        }
        return false;
    }

    public static int numberOfLeapYears(int year1, int year2) {
        int count = 0;
        for(int i = year1; i < year2 + 1; i++) {
            if(isLeapYear(i)) {
                count++;
            }
        }
        return count;
    }

    private static int firstDayOfYear(int year) {
        return 0;
    }

    private static int dayOfYear(int month, int day, int year) {
        int days = 0;
        if(year % 4 == 0) {
            for(int i = 0; i < month; i++) {
                if(month % 2 != 0) {
                    days += 31;
                }
                else if(i == 2){
                    days += 29;
                }
                else{
                    days += 30;
                }
            }
        }
        if(year % 4 != 0){
            for(int i = 0; i < month; i++) {
                if(month % 2 != 0) {
                    days += 31;
                }
                else if(i == 2){
                    days += 28;
                }
                else{
                    days += 30;
                }
            }
        }
        return days;
    }
    //no clue if works
    //can increment through entire year and reset day count to zero
    public static int dayOfWeek(int month, int day, int year) {
        int count = dayOfYear(month, day, year) % 7;
        if(count + firstDayOfYear(year) > 6) {
            return count + firstDayOfYear(year) - 7;
        }
        return count + firstDayOfYear(year);
    }
}
