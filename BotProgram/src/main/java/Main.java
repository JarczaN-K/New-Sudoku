import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String name = "notepad.exe";
        Runtime runtime = Runtime.getRuntime();
        runtime.exec(name);
    }
}
