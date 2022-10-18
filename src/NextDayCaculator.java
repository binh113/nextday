import java.util.Date;

public class NextDayCaculator {
    public static Date nextDay(Date toDay) {
        if (lastDayOfYear(toDay)) {
            return new Date(toDay.getYear() + 1, 1, 1);
        } else if (lastDayOfMonth(toDay)) {
            return new Date(toDay.getYear(), toDay.getMonth() + 1, 1);

        } else {
            return new Date(toDay.getYear(), toDay.getMonth(), toDay.getDate() + 1);
        }
    }

    public static boolean lastDayOfYear(Date toDay) {
        if (toDay.getDate() == 31 && toDay.getMonth() == 12) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean lastDayOfMonth(Date toDay) {
        int month = toDay.getMonth();
        int day = toDay.getDate();
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 30) {
                return true;
            }
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day == 31) {
                return true;
            }
        } else if (month == 2) {
            if (isLeapYear(toDay)) {
                if (day == 29 || day == 28) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean isLeapYear(Date toDay) {
        int year = toDay.getYear();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}