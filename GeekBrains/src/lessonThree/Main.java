package lessonThree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> uniqueWords = new HashMap<>();
        List<String> words = List.of(
                "яблоко", "груша",
                "арбуз", "банан",
                "яблоко", "груша",
                "груша", "морковь",
                "арбуз", "помидор",
                "морковь");
        for (int i = 0; i < words.size(); i++) {
            int count = 0;
            for (int j = 0; j < words.size(); j++) {
                if (words.get(i).equals(words.get(j))) {
                    count++;
                }
            }
            uniqueWords.put(words.get(i), count);
        }

        System.out.format("количество уникальных слов: %d", uniqueWords.size());
        System.out.println();

        for (Map.Entry<String, Integer> m : uniqueWords.entrySet()) {
            System.out.println(m.getKey() + ": " + m.getValue());
        }
    }
}
