package Lesson_2.zadacha_2_4_9;

public class Education {
    public static class Student {

        protected final String studying;
        protected Student(String work) {
            this.studying = work;
        }

        public Student() {
            this.studying = "Прохожу тестовое задание.";
        }
        public void study() {
            System.out.println("Я очень занят. " + studying);
        }
    }

    public static class JavaStudent extends Student{
        }
                public  void study() {
    }
        public static void main(String[] args) {
            Student studentJava= new Student("Учу джаву");
            studentJava.study();
        }
    }


