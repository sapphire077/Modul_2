package Lesson_2.zadacha_2_5_7;

public class Task2_5_7 {
    abstract static class KeyWordAnalyzer implements TextAtalizer {
abstract protected String[] getKeyWords();
abstract protected Label getLabel();

        @Override
        public Label processText(String text) {
            String[] keyWords=getKeyWords();
            for (int i=0;i< keyWords.length;i++){
                if (text.indexOf(keyWords[i])!=-1){
                    return getLabel();
                }
            }
            return Label.OK;
        }
    }
    class  SpamAnalyzer implements TextAtalizer{
        private String [] keyWords;
        private Label label=Label.SPAM;
        public SpamAnalyzer(String[] text) {
            this.keyWords=text;
                    }

        public String[] getKeyWords() {
            return keyWords;
        }
        public Label getLabel() {
            return label;
        }
        @Override
        public Label processText(String text) {
            return null;
        }
    }
    class  NegativeTextAnalyzer implements TextAtalizer {
        private String[] keyWords= {":(","=(",":|"};
        private Label label=Label.NEGATIVE_TEXT;

        public String[] getKeyWords() {
            return keyWords;
        }

        public Label getLabel() {
            return label;
        }


        @Override
        public Label processText(String text) {
            return null;
        }
    }
    class TooLongTextAnalyzer implements TextAtalizer{
        private  int maxLenght;
        public TooLongTextAnalyzer(int a) {
            this.maxLenght = a;
        }

        @Override
        public Label processText(String text) {
            return text.length()>maxLenght?Label.TOO_LONG:Label.OK;
        }
    }
public Label checkLabels(TextAtalizer[] atalizers,String text){
        for (TextAtalizer analiz: atalizers){
            Label result;
            if ((result=analiz.processText(text))!=Label.OK){
                return result;
            }
        }
        return Label.OK;
}
}
