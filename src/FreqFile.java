import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Hashtable;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.LinkedHashMap; // Import the Dictionary class to store the frequencies of each character


public class FreqFile {

    private String file_name;
    private File freq_file;
    private Scanner file_reader;

    public FreqFile(String file_name) throws FileNotFoundException {
        this.file_name = file_name;
        freq_file = new File("./input/"+this.file_name+"_freq.txt");
        file_reader = new Scanner(freq_file);
    }

    public int getNumberOfCharacters(){
        String number_str = file_reader.nextLine();
        int number = Integer.parseInt(number_str);
        return number;
    }

    public LinkedHashMap<String,Integer> getFreqDict(){
        LinkedHashMap<String,Integer> freq = new LinkedHashMap<String,Integer>();

        while (file_reader.hasNextLine()) {
            String line = file_reader.nextLine();
            String[] data = line.split(" ");
            freq.put(data[0],Integer.parseInt(data[1]));
        }
        return freq;
    }


}
