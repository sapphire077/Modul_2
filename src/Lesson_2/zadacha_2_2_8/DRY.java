package Lesson_2.zadacha_2_2_8;

import java.util.Arrays;

public class DRY {
    public static void main(String[] args) {
          isWeekend("Понедельник");
          isWeekend("Суббота");
weekendCount(new String[]{"Суббота","Понедельник","Вторник","Воскресение","Суббота"});
        weekdayCount(new String[]{"Понедельник", "Вторник", "Суббота","Пятница"});
    }

    public static boolean isWeekend(String dayName) {
        if (dayName.equalsIgnoreCase("Суббота") || dayName.equalsIgnoreCase("Воскресение")) {
            System.out.println(dayName + "- является выходным днем" + " " + true);
            return true;
        } else
            System.out.println(dayName + "- не является выходным днем" + " " + false);
        return false;
    }

    public static int weekendCount(String[] days) {
        int count = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i].equalsIgnoreCase("Суббота")
                    || days[i].equalsIgnoreCase("Воскресение")) {
                count++;

            } else continue;
        }
        System.out.println("Количество выходных дней в массиве составлет: "+count);

        return count;
    }

    public static int weekdayCount(String[] days) {
        int count = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i].equalsIgnoreCase("Понедельник")|| days[i].equalsIgnoreCase("Вторник")
            ||days[i].equalsIgnoreCase("Среда") || days[i].equalsIgnoreCase("Четверг")
            ||days[i].equalsIgnoreCase("Пятница")){
                count++;
            } else continue;
        }
        System.out.println("Количество будних дней в массиве состваляет: "+count);

        return count;
    }
}


