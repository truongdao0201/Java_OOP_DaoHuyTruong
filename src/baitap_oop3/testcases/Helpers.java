package baitap_oop3.testcases;
import java.io.File;
public class Helpers {
    public static String getCurrentDir() {
        String current = System.getProperty("user.dir") + File.separator;
        return current;
    }
}
