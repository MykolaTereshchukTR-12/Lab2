package org.example;

public class DaysMonthsYears {
    public String DaysInWeek(int _a) {
        return switch (_a) {
            case 1 -> "This day is Monday. It's workday!";
            case 2 -> "This day is Tuesday. It's workday!";
            case 3 -> "This day is Wednesday. It's workday!";
            case 4 -> "This day is Thursday. It's workday!";
            case 5 -> "This day is Friday. It's workday!";
            case 6 -> "This day is Saturday. It's DAY OFF!!! It's time to enjoy!";
            case 7 -> "This day is Sunday. It's DAY OFF!!! It's time to enjoy!";
            default -> "I don't know what it is...";
        };
    }

    public String MonthsInYear(int _a) {
        return switch (_a) {
            case 1 -> "This month is January. It belongs to winter.";
            case 2 -> "This month is February. It belongs to winter.";
            case 3 -> "This month is March. It belongs to spring.";
            case 4 -> "This month is April. It belongs to spring.";
            case 5 -> "This month is May. It belongs to spring.";
            case 6 -> "This month is June. It belongs to summer.";
            case 7 -> "This month is July. It belongs to summer.";
            case 8 -> "This month is August. It belongs to summer.";
            case 9 -> "This month is September. It belongs to autumn.";
            case 10 -> "This month is October. It belongs to autumn.";
            case 11 -> "This month is November. It belongs to autumn.";
            case 12 -> "This month is December. It belongs to winter.";
            default -> "I don't know what it is...";
        };
    }

    public String DaysInMonth(int _a) {
        return switch (_a) {
            case 1 -> "This month is January. The number of days in it is 31.";
            case 2 -> "This month is February. The number of days in it is 28/29.";
            case 3 -> "This month is March. The number of days in it is 31.";
            case 4 -> "This month is April. The number of days in it is 30.";
            case 5 -> "This month is May. The number of days in it is 31.";
            case 6 -> "This month is June. The number of days in it is 30.";
            case 7 -> "This month is July. The number of days in it is 31.";
            case 8 -> "This month is August. The number of days in it is 31.";
            case 9 -> "This month is September. The number of days in it is 30.";
            case 10 -> "This month is October. The number of days in it is 31.";
            case 11 -> "This month is November. The number of days in it is 30.";
            case 12 -> "This month is December. The number of days in it is 31.";
            default -> "I don't know what it is...";
        };
    }

    public String NumberOfSubject(int _a) {
        return switch (_a) {
            case 1 -> "Object-oriented programming :)";
            case 2 -> "Transmission of signals in information systems <3";
            default -> "Today only the first two subjects!!! ";
        };
    }

    public String QuarterOfDay(int _minute) {
        if(_minute >= 0 && _minute <= 14){
            return "This is the first quarter of a priceless day)";
        } else if(_minute >= 15 && _minute <= 29){
            return "This is the second quarter of a priceless day)";
        } else if(_minute >= 30 && _minute <= 44){
            return "This is the third quarter of a priceless day)";
        } else if(_minute >= 45 && _minute <= 59){
            return "This is the fourth quarter of a priceless day)";
        } else {
            return "What minute is this anyway?";
        }
    }


}
