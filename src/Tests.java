import java.io.IOException;
import java.util.LinkedHashMap;

public class Tests {

    public static void main(String[] args) throws IOException {

        FreqFile file = new FreqFile("exemple");
        int nb_characters = file.getNumberOfCharacters();
        LinkedHashMap<String, Integer> freq = file.getFreqDict();
        System.out.println(freq);
        System.out.println(nb_characters);
    }
}