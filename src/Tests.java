import java.io.IOException;
import java.util.LinkedHashMap;

public class Tests {

    public static void main(String[] args) throws IOException {

        FreqFile file = new FreqFile("exemple");
        int nb_characters = file.getNumberOfCharacters();
        LinkedHashMap<String,Integer> freq = file.getFreqDict();
        HuffmanTree tree = new HuffmanTree(freq);
        BinFile f = new BinFile("exemple");
        String bin = f.getBinToStr();
        String res = tree.decode(bin);
        System.out.println(res);

    }
}
