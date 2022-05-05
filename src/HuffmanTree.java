import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.ArrayList;
import java.util.Comparator;

public class HuffmanTree {

    private ArrayList<Node> nodes;

    public HuffmanTree(LinkedHashMap<String,Integer> freq){

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
        this.nodes = nodes;
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }
}
