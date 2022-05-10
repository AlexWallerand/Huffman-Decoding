import java.io.FileInputStream; // Import the FileInputStream class used in the buffer
import java.io.BufferedInputStream; // Import the BufferedInputStream class to store the bytes of the file
import java.io.File; // Import the File class to instantiate the bin file
import java.io.FileNotFoundException; // Import the FileNotExcepetion class to handle errors
import java.io.IOException; // Import the IOException class to handle errors

public class BinFile {
    /**
     * Class to read the compressed .bin file and converts its content.
     */

    private String file_name;
    private FileInputStream fis;
    private  BufferedInputStream reader;

    public BinFile(String file_name) throws FileNotFoundException {
        /**
         * Constructor of the class, that instantiates the FileInputStream and the BufferedInputStream
         * @params file_name, name of the file
         * @throws FileNotFoundException
         */
        this.file_name = file_name;
        fis = new FileInputStream(new File("./input/"+this.file_name+"_comp.bin"));
        reader = new BufferedInputStream(fis);
    }

    public String getBinToStr() throws IOException {
        /**
         * Method to get the bytes of the file and convert it into a string that contains a sequence of bits.
         * @param null
         * @throws IOException
         * @returns res, the sequence of bits of the file
         */
        int ch;
        String res = Integer.toBinaryString(reader.read());
        while((ch = reader.read()) != -1){
            if(Integer.toBinaryString(ch).length() != 8){
                String temp = "";
                String temp_res = "";
                for(int i=0;i<(8-Integer.toBinaryString(ch).length());i++){
                    temp += "0";
                }
                temp_res = temp + Integer.toBinaryString(ch);
                res += temp_res;
            }
            else{
                res += Integer.toBinaryString(ch);
            }
        }
        reader.close();
        return res;
    }
}
