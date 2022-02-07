import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Word implements Comparable<Word> {
    String word;
    int count;

    Word(String s) {

        /* char[] word_charArr = word.toCharArray(); */
        char[] vocalArr = new char[] { 'а', 'е', 'ё', 'ы', 'о', 'у', 'и', 'я', 'ю', 'є' };
        this.count = 0;
        char[] word_charArr = s.toCharArray();
        boolean firstVocal = true;
        for (int i = 0; i < word_charArr.length; i++) {
            for (char ch2 : vocalArr) {
                if (word_charArr[i] == ch2) {
                    this.count++;
                    if (firstVocal) {
                        word_charArr[i] = Character.toUpperCase(word_charArr[i]);
                        firstVocal = false;
                    }
                }
            }
        }
        this.word = new String(word_charArr);
    }

    void displayInfo() {
        System.out.println(this.word + " " + this.count);
    }

    @Override
    public int compareTo(Word o) {
        return o.count - this.count;
    }

}

public class third {
    class WordComparator implements Comparator<Word> {

        public int compare(Word a, Word b) {

            return a.count - b.count;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in, "Cp866");
        System.out.println("Введите несколько слов(!!работает только с русскими символами!!)");
        String[] line = in.nextLine().split(" ");
        ArrayList<Word> words = new ArrayList<Word>();
        for (String string : line) {
            Word word = new Word(string);
            words.add(word);
        }

        Collections.sort(words);
        for (Word word : words) {
            word.displayInfo();
        }
    }

}
