import java.io.File;
import java.util.Scanner;

public class readFile {

    Scanner x;

    public void openFile() {
        try {
            x = new Scanner(new File("/Users/Arman Khan/Desktop/JohnSample.txt"));
        } catch (Exception e) {
            System.out.println("could not find file");
        }
    }

    public void readFile(String word) {

        while(x.hasNextLine()) {
            String line = x.nextLine();
            line = line.replaceAll(word,"");
            System.out.println(line);
        }

    }

    public void closeFile() {
        x.close();
    }
}
