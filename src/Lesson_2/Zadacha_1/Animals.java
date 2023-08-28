package Lesson_2.Zadacha_1;

public class Animals {
    public static void main(String[] args) {
Cat.sayHello();
        System.out.println("----------------------");
Dog.sayHello();
        System.out.print("-----------------------\n");
Dog.cathCat();
        }
public static class  Cat{
public static void   sayHello (){
    System.out.println("кошка говорит Мяу!");
}
    }    public static class Dog{
        public static void  sayHello (){
            System.out.println("собака говорит гаф!");
        }
        public static void cathCat(){
            System.out.println("Кошка поймана");
            sayHello();
            Cat.sayHello();
        }
    }
}

