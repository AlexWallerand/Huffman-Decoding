import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;
import java.util.ArrayList;

public class Tests {

    public static void main(String[] args) throws IOException {
        FreqFile file = new FreqFile("exemple");
        int nb_characters = file.getNumberOfCharacters();
        LinkedHashMap<String,Integer> freq = file.getFreqDict();
        HuffmanTree tree = new HuffmanTree(freq);
        BinFile f = new BinFile("exemple");
        System.out.println(f.getBinToStr());
    }
}
