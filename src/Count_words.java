import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
public  class Count_words{

    public static int start_freq() throws IOException {
        String fileName = "/home/nicolas/Bureau/test.txt";
        String line = null;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String[] tot= new String[100];
            while((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                words = sortWordsViaFrequencies(words);
                for (int i = 0; i < 3; i ++){
                    System.out.print(words[i]+" ");
                };


        }            bufferedReader.close();

    }
        catch(FileNotFoundException ex) {
            System.out.println("Unreadable file: " + fileName );
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "': " + ex.getMessage());
            ex.printStackTrace();
        }
        return 0;

    
    }
        
      


    public static void sortWordsUsingFrequencies(String[] words,
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

    public static Map<String, Integer> computeWordFrequencyMap(String[] words) {
        Map<String, Integer> result = new HashMap<>(words.length);

        for (String word : words) {
            result.put(word, result.getOrDefault(word, 0) + 1);
        }

        return result;
    }

    public static String[] sortWordsViaFrequencies(String[] words) {
        Map<String, Integer> frequencyMap = computeWordFrequencyMap(words);

        String[] uniqueWords = 
                frequencyMap.keySet().toArray(new String[frequencyMap.size()]);

        sortWordsUsingFrequencies(uniqueWords, frequencyMap);
        return uniqueWords;
    }
    
}
/*


    public  void main(String[] args) {
        // Input array
        String[] arr = {"geeks", "for", "geeks", "a", "portal", "to", "learn",
                        "can", "be", "computer", "science", "zoom", "yup",
                        "fire", "in", "be", "data", "a", "portal", "geeks"};
        arr = sortWordsViaFrequencies(arr);
        System.out.println(Arrays.asList(arr));
    }
}*/