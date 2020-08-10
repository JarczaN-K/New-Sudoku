import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, AWTException {
        String name = "notepad.exe";
        Runtime runtime = Runtime.getRuntime();
        runtime.exec(name);
        Robot robot = new Robot();
        robot.setAutoDelay(100);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_J);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_1);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_J);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyPress(KeyEvent.VK_B);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_M);
    }
}
