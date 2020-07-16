public class RmvText {

    public static void main(String[] args) {
        readFile r = new readFile();
        r.openFile();
        r.readFile(args[0]);
        r.closeFile();
    }
}
