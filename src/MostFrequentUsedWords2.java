
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class MostFrequentUsedWords2 {

    private MostFrequentUsedWords2() {
    }

    public static String[] sortWordsViaFrequencies(String[] words) {
        Map<String, Integer> frequencyMap = computeWordFrequencyMap(words);

        String[] uniqueWords = 
                frequencyMap.keySet().toArray(new String[frequencyMap.size()]);

        sortWordsUsingFrequencies(uniqueWords, frequencyMap);
        return uniqueWords;
    }

    private static Map<String, Integer> computeWordFrequencyMap(String[] words) {
        Map<String, Integer> result = new HashMap<>(words.length);

        for (String word : words) {
            result.put(word, result.getOrDefault(word, 0) + 1);
        }

        return result;
    }

    private static void sortWordsUsingFrequencies(String[] words,
            Map<String, Integer> frequencyMap) {
        Arrays.sort(words, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                // Largest frequency first:
                return Integer.compare(frequencyMap.get(o2),
                        frequencyMap.get(o1));
            }
        });
    }

    public static void main(String[] args) {
        // Input array
        String[] arr = {"geeks", "for", "geeks", "a", "portal", "to", "learn",
                        "can", "be", "computer", "science", "zoom", "yup",
                        "fire", "in", "be", "data", "a", "portal", "geeks"};
        arr = sortWordsViaFrequencies(arr);
        System.out.println(Arrays.asList(arr));
    }
}