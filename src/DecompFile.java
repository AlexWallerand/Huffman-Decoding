import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DecompFile {

    private String file_name;
    private File file;
    private FileWriter writer;

    public DecompFile(String file_name) throws IOException {
        this.file_name = file_name;
        file = new File("./output/"+file_name+"_decomp.txt");
        writer = new FileWriter("./output/"+file_name+"_decomp.txt");
    }

    public void write_text(String res) throws IOException {
        writer.write(res);
        writer.close();
        System.out.println("Text successfully wrote to the output file");
    }
}
