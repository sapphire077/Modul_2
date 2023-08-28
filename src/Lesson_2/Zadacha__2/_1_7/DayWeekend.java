package Lesson_2.Zadacha__2._1_7;

public class DayWeekend {
    public static void main(String[] args) {
getRusName(Dday.FRIDAY);

isWeekend(Dday.MONDAY);
        }
    public static  void getRusName(Dday today){

        switch (today) {
            case MONDAY -> System.out.println("Понедельник");
            case TUESDAY -> System.out.println("Вторник");
            case WEDNESDAY -> System.out.println("среда");
            case THURSDAY -> System.out.println("четверг");
            case FRIDAY -> System.out.println("пятница");
            case SUNDAY -> System.out.println("cуббота");
            case SATURDAY -> System.out.println("воскресение");

        }

        }
        public static boolean isWeekend(Dday today){

            switch (today) {
                case MONDAY -> System.out.println(Dday.MONDAY+ ": не является выходным" +false);
                case TUESDAY -> System.out.println(Dday.TUESDAY+ ": не является выходным" +false);
                case WEDNESDAY -> System.out.println(Dday.WEDNESDAY+ ": не является выходным" +false);
                case THURSDAY -> System.out.println(Dday.THURSDAY+ ": не является выходным" +false);
                case FRIDAY -> System.out.println(Dday.FRIDAY+ ": не является выходным" +false);
                case SUNDAY -> System.out.println(Dday.SUNDAY+ ": Ура, выходной!"+ true);
                case SATURDAY -> System.out.println(Dday.SATURDAY+ ": Ура, выходной!"+ true);
            }
          return false;
    }

   enum Dday {
       MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;





}

       }







