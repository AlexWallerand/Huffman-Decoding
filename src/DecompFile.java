import java.io.File; // Import the File class to instantiate the file
import java.io.FileWriter; // Import the FileWriter class to instantiate the writer
import java.io.IOException; // Import the IOException class to handle errors

public class DecompFile {
    /**
     * Class to create and write the decompressed file
     */

    private String file_name;
    private File file;
    private FileWriter writer;

    public DecompFile(String file_name) throws IOException {
        /**
         * Constructor of the class that instantiates the file and the writer
         * @param file_name, the name of the file
         * @throws IOException
         */
        this.file_name = file_name;
        file = new File("./output/"+file_name+"_decomp.txt");
        writer = new FileWriter("./output/"+file_name+"_decomp.txt");
    }

    public void write_text(String res) throws IOException {
        /**
         * Method to write a string into the file
         * @param res, the text to write
         * @throws IOException
         */
        writer.write(res);
        writer.close();
        System.out.println("Text successfully wrote to the output file");
    }
}
