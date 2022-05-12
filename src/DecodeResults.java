import java.util.LinkedHashMap; // Import LinkedHashMap for the dictionary of character associated with its length in bits

public class DecodeResults {
    /**
     *Class to handle the results provided by the decoding method of the HuffmanTree class.
     */
    private String text;
    private LinkedHashMap<String, Integer> char_len;

    public DecodeResults(String text, LinkedHashMap<String, Integer> char_len) {
        /**
         * Constructor of the DecodeResults Class
         * @param text, the decompressed text
         *        char_len, the map of length of every character in bits
         */
        this.text = text;
        this.char_len = char_len;
    }

    public String getText() {
        /**
         * Getter of the text
         * @returns text
         */
        return text;
    }

    public float getAverageNumberOfBits(){
        /**
         * Methode to calculate the average number of bits per character
         * @returns float, the average
         */
        int res = 0;
        for(int number : char_len.values()){
            res += number;
        }
        return (float) res/char_len.size();
    }
}
