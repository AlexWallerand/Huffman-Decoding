public class Node {
    private String label;
    private int frequency;
    private Node leftChild;
    private Node rightChild;
    private String branch;

    public Node(String label, int frequency) {
        this.label = label;
        this.frequency = frequency;
        this.leftChild = null;
        this.rightChild = null;
        this.branch = "";
    }

    public Node(String label, int frequency, Node leftChild, Node rightChild) {
        this.label = label;
        this.frequency = frequency;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.branch ="";
    }

    public int getFrequency() {
        return this.frequency;
    }

    public String getLabel() {
        return label;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }


    @Override
    public String toString() {
        return "label='" + label + '\'' + ", frequency=" + frequency + ", branch=" + branch + " {" + leftChild + rightChild + "} ";
    }
}
