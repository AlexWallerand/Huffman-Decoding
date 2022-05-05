import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;
import java.util.ArrayList;

public class Tests {

    public static void main(String[] args) throws FileNotFoundException {
        /*FreqFile file = new FreqFile("exemple");
        int nb_characters = file.getNumberOfCharacters();
        LinkedHashMap<String,Integer> freq = file.read();
        System.out.println(freq);*/
        LinkedHashMap d = new LinkedHashMap<>();
        d.put("b",1);
        d.put("c",6);
        d.put("a",5);
        d.put("d",3);
        HuffmanTree tree = new HuffmanTree(d);
        System.out.println(tree.getNodes());
    }
}
