import java.io.File; // Import the File class to instantiate the file

public class CompressRate {
    /**
     * Class to calculate the CompressRate
     */

    private String file_name;
    private File comp;
    private File decomp;

    public CompressRate(String file_name) {
        /**
         * Constructor of the class, that instantiates the compressed and decompressed files
         * @param file_name, name of the file
         */
        this.file_name = file_name;
        File comp = new File("./input/"+file_name+"_comp.bin");
        File decomp = new File("./output/"+file_name+"_decomp.txt");
        this.comp = comp;
        this.decomp = decomp;
    }

    public void calculate(){
        /**
         *Method to calculate and print the compress rate, by getting the sizes of both the compressed and decompressed files
         * @param null
         * @returns void
         */
        float res;
        float comp_size = (float) comp.length();
        float decomp_size = (float) decomp.length();
        res = 1 - (comp_size/decomp_size);
        res *= 100;
        String str = String.format("%.2f",res);
        System.out.println("Compress rate: "+str+"%");
    }
}
