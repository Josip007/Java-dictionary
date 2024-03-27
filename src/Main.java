
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dict1 = new SimpleDictionary();
        TextUI ui = new TextUI(scanner, dict1);
        ui.start();
    }
}
