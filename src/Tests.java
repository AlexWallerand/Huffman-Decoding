import java.io.IOException;
import java.util.LinkedHashMap;

public class Tests {

    public static void main(String[] args) throws IOException {

        FreqFile file = new FreqFile("textesimple");
        int nb_characters = file.getNumberOfCharacters();
        LinkedHashMap<String, Integer> freq = file.getFreqDict();
        HuffmanTree tree = new HuffmanTree(freq);
        System.out.println(tree.getNodes());
        BinFile f = new BinFile("textesimple");
        String bin = f.getBinToStr();
        String res = tree.decode(bin);
        System.out.println(res);
        DecompFile output = new DecompFile("textesimple");
        output.write_text(res);
        CompressRate compressRate = new CompressRate("textesimple");
        compressRate.calculate();
    }
}