package Lesson_2.zadacha_2_5_6;

import java.util.Arrays;

public class Task2_5_6 {

    static class AsciiCharSequence implements CharSequence{

byte[] bytes;

        public AsciiCharSequence(byte[] res) {
            this.bytes = bytes;
        }

        @Override
        public int length() {
            return bytes.length;
        }

        @Override
        public char charAt(int index) {
            return (char) bytes[index];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            byte[] res= new byte[end-start];
            for (int i=start; i<end;i++){
                res[i-start]=bytes[i];
            }
            return new AsciiCharSequence(res);
        }
      public String toString(){

            return "AsciiCharSequence{bytes="+ Arrays.toString(bytes) +"}";
        }
    }
}

