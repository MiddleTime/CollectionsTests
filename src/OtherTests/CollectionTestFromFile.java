package OtherTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestFromFile {
    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream("d:/moscow-buildings.csv");
        int length = stream.available();
        byte[] data = new byte[length];
        stream.read(data);  //прочитал файл в память

        //преобразуем битовые данные в текст
        String text = new String(data);
        //System.out.println(text);

        //разделим текст и поместим в массив
        String[] lines = text.split("\n");
//        for (String line : lines) {
//            System.out.println(line);
//            System.out.println("---------------------------");
//        }
        //разобъем по словам строки
        List<String []> lineWords = new ArrayList<>();
        for (String line : lines) {
            String [] words = line.split(",");
            lineWords.add(words);

        }

//        for (String[] words: lineWords) {
//            for (String word: words) {
//                System.out.print(word);
//                System.out.print("|");
//            }
//            System.out.println("----------------");
//        }

        for (String[] words: lineWords) {
            if (words[9].equals("1999")) {
                for (String word : words) {
                    System.out.print(word);
                    System.out.print("|");
                }
                System.out.println("\n----------------");
            }
        }


    }
}
