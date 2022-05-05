import java.io.*;

public class BinFile {

    private String file_name;
    private FileInputStream fis;
    private  BufferedInputStream reader;

    public BinFile(String file_name) throws FileNotFoundException {
        this.file_name = file_name;
        fis = new FileInputStream(new File("./input/"+this.file_name+"_comp.bin"));
        reader = new BufferedInputStream(fis);
    }

    public String getBinToStr() throws IOException {
        int ch;
        String res = "";
        while((ch = reader.read()) != -1){
            res = res.concat(Integer.toBinaryString(ch));
        }
        reader.close();
        return res;
    }
}
