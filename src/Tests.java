import java.io.IOException;
import java.util.LinkedHashMap;

public class Tests {

    public static void main(String[] args) throws IOException {

        FreqFile file = new FreqFile("extraitalice");
        int nb_characters = file.getNumberOfCharacters();
        LinkedHashMap<String, Integer> freq = file.getFreqDict();
        HuffmanTree tree = new HuffmanTree(freq);
        System.out.println(tree.getNodes());
        BinFile f = new BinFile("extraitalice");
        String bin = f.getBinToStr();
        String res = tree.decode(bin);
        System.out.println(res);
        DecompFile output = new DecompFile("extraitalice");
        output.write_text(res);
    }
}