import java.io.IOException;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        for (String arg : args) {

            System.out.println("\nStarting the decompression of " + arg);

            // Read the frequency file and get the data into a map
            FreqFile file = new FreqFile(arg);
            int nb_characters = file.getNumberOfCharacters();
            LinkedHashMap<String, Integer> freq = file.getFreqDict();

            // Build the HuffmanTree with the frequency map
            HuffmanTree tree = new HuffmanTree(freq);

            // Read the binary file to convert the bytes to a binary string
            BinFile f = new BinFile(arg);
            String bin = f.getBinToStr();

            // Decode the binary string by coursing the HuffmanTree
            DecodeResults res = tree.decode(bin);
            String text = res.getText();
            float average = res.getAverageNumberOfBits();

            // Generate the results in a text file
            DecompFile output = new DecompFile(arg);
            output.write_text(text);
            CompressRate compressRate = new CompressRate(arg);
            System.out.printf("Average bits per character: " + "%.2f%n", average);
            compressRate.calculate();
        }
    }
}
