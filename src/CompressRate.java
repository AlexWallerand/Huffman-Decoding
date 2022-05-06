import java.io.File;

public class CompressRate {

    private String file_name;
    private File comp;
    private File decomp;

    public CompressRate(String file_name) {
        this.file_name = file_name;
        File comp = new File("./input/"+file_name+"_comp.bin");
        File decomp = new File("./output/"+file_name+"_decomp.txt");
        this.comp = comp;
        this.decomp = decomp;
    }

    public void calculate(){
        float res;
        float comp_size = (float) comp.length();
        float decomp_size = (float) decomp.length();
        res = 1 - (comp_size/decomp_size);
        res *= 100;
        String str = String.format("%.2f",res);
        System.out.println("Compress rate: "+str+"%");
    }
}
