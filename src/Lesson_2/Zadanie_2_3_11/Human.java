package Lesson_2.Zadanie_2_3_11;

public class Human {
    private final String secret; //секретики
    private final String news; //новости
    private final String experience; //опыт
    private final String gossip; //сплетни

    public Human(String secret, String news, String experience, String gossip) {
        this.secret = secret;
        this.news = news;
        this.experience = experience;
        this.gossip = gossip;
    }

    public String getSecret() {
        return secret;
    }

    public String getNews() {
        return news;
    }

    public String getExperience() {
        return experience;
    }

    public String getGossip() {
        return gossip;
    }

    public static void main(String[] args) {


        Human human1 = new Human("f", "fq", "qqq", ",,,");
        System.out.println(human1.experience);
    }
}
