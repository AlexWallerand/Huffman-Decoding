import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.LinkedHashMap; // Import the Dictionary class to store the frequencies of each character


public class FreqFile {
    /**
     * Class to read the frequency file. It uses a scanner to analyze the content.
     */

    private String file_name;
    private File freq_file;
    private Scanner file_reader;

    public FreqFile(String file_name) throws FileNotFoundException {
        /**
         * Constructor of the FreqFile class. Instantiate the file object and the scanner object.
         * @param file_name, Name of the file
         * @throws FileNotFoundException
         */
        this.file_name = file_name;
        freq_file = new File("./input/"+this.file_name+"_freq.txt");
        file_reader = new Scanner(freq_file);
    }

    public int getNumberOfCharacters(){
        /**
         * Method to use at first with the scanner it reads the first line to get the number of characters
         * @param null
         * @returns number, The number of character which is the string of the first line
         */
        String number_str = file_reader.nextLine();
        int number = Integer.parseInt(number_str);
        return number;
    }

    public LinkedHashMap<String,Integer> getFreqDict(){
        /**
         * Method to get the dictionary of the frequencies of every character
         * @param null
         * @returns freq, Dictionary that contains the key-value pair character-frequency
         */
        LinkedHashMap<String,Integer> freq = new LinkedHashMap<String,Integer>();

        while (file_reader.hasNextLine()) {
            String line = file_reader.nextLine();
            char character  = line.charAt(0);
            String c;
            String number;

            if(character == '\\'){
                c = "\n";
            }else{
                c = Character.toString(character);
            }

            if (character != ' ') {
                number = line.split(" ")[1];
            }
            else{
                number = line.split(" ")[2];
            }

            freq.put(c,Integer.parseInt(number));
        }
        return freq;
    }

}
