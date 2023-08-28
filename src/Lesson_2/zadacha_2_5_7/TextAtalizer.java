package Lesson_2.zadacha_2_5_7;

public interface TextAtalizer {
    Label processText(String text);
}

enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}

