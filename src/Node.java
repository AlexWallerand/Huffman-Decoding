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

    public int getFrequency() {
        return this.frequency;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
