import java.io.FileNotFoundException;

public class Tests {

    public static void main(String[] args) throws FileNotFoundException {
        FreqFile file = new FreqFile("exemple");
        int nb_characters = file.getNumberOfCharacters();
        System.out.println(file.read());
    }
}
