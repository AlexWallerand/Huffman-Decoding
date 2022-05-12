import java.util.ArrayList; // Import the ArrayList class for the nodes list
import java.util.LinkedHashMap; // Import the LinkedHashMap class for the frequencies dictionary
import java.util.Set; // Import the Set class to have a set of all the keys of the dictionary
import java.util.Comparator; // Import the Comparator class to sort the nodes list

public class HuffmanTree {
    /**
     * Class to create the Huffman tree, which contains a list of nodes of the Node class
     */

    private ArrayList<Node> nodes;

    public HuffmanTree(LinkedHashMap<String,Integer> freq){
        /**
         * Constructor of the HuffmanTree class
         * @param freq, dictionary of frequencies
         */

        nodes = new ArrayList<>();
        Set<String> keys = freq.keySet();

        for(String key : keys){
            nodes.add(new Node(key,freq.get(key)));
        }

        while(nodes.size() > 1){
            nodes.sort(Comparator.comparing(Node::getFrequency).thenComparing(Node::getLabel));

            Node left = nodes.get(0);
            nodes.remove(0);
            left.setBranch("0");

            Node right = nodes.get(0);
            nodes.remove(0);
            right.setBranch("1");

            int sum = left.getFrequency() + right.getFrequency();
            Node newNode = new Node(Integer.toString(sum),sum,left,right);

            nodes.add(newNode);
        }
    }

    public ArrayList<Node> getNodes() {
        /**
         * Getter of the nodes attribute
         */
        return nodes;
    }

    public DecodeResults decode(String bin) {
        /**
         * Method to decode a string of bits, by doing an in-depth course of the HuffmanTree
         * @param bin, string that contains a sequence of bits
         * @returns DecodeResults, the result of the decoding process, which contains the text and a map with length of the characters
         */
        Node root = nodes.get(0);
        String text = "";
        LinkedHashMap<String, Integer> char_len = new LinkedHashMap<>();
        int nb = 0;
        while (bin.length() != 0) {
            if (bin.charAt(0) == '0' && root.getLeftChild() != null) {
                root = root.getLeftChild();
                bin = bin.substring(1);
                nb++;
                if(bin.length() == 0){
                    text += root.getLabel();
                }
            } else if (bin.charAt(0) == '1' && root.getRightChild() != null) {
                root = root.getRightChild();
                bin = bin.substring(1);
                nb++;
                if(bin.length() == 0){
                    text += root.getLabel();
                }
            } else if (root.getLeftChild() == null && root.getRightChild() == null) {
                String character = root.getLabel();
                text += character;
                char_len.put(character,nb);
                root = nodes.get(0);
                nb = 0;
            }
        }
        return new DecodeResults(text, char_len);

    }
}
