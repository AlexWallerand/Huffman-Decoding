public class Node {
    /**
     * Class to create a node for the Huffman tree
     */
    private String label;
    private int frequency;
    private Node leftChild;
    private Node rightChild;
    private String branch;

    public Node(String label, int frequency) {
        /**
         * Constructor used to instantiate at first the nodes in the frequencies dictionary
         * @params label, frequency
         */
        this.label = label;
        this.frequency = frequency;
        this.leftChild = null;
        this.rightChild = null;
        this.branch = "";
    }

    public Node(String label, int frequency, Node leftChild, Node rightChild) {
        /**
         * Constructor used to instantiate the node with children. Used during the process of creation of the tree.
         * @params label, frequency, leftChild, rightChild
         */
        this.label = label;
        this.frequency = frequency;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.branch ="";
    }

    public int getFrequency() {
        /**
         * Getter of the frequency attribute
         */
        return this.frequency;
    }

    public String getLabel() {
        /**
         * Getter of the label attribute
         */
        return label;
    }

    public Node getLeftChild() {
        /**
         * Getter of the leftChild attribute
         */
        return leftChild;
    }

    public Node getRightChild() {
        /**
         * Getter of the rightChild attribute
         */
        return rightChild;
    }

    public void setBranch(String branch) {
        /**
         * Setter of the branch attribute
         * @param branch, value of the branch in a string
         */
        this.branch = branch;
    }

    @Override
    public String toString() {
        /**
         * Override of the toString method to display a node's attributes for tests.
         */
        return "label='" + label + '\'' + ", frequency=" + frequency + ", branch=" + branch + " {" + leftChild + rightChild + "} ";
    }
}
