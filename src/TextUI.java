
import java.util.Scanner;

public class TextUI {
    private final Scanner scan;
    private final SimpleDictionary dictionary;

    public TextUI(Scanner scan, SimpleDictionary dictionary) {
        this.scan = scan;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scan.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye");
                break;
            }
            if(command.equals("add")) {
                System.out.println("Word:");
                String word = scan.nextLine();
                System.out.println("Translation");
                String translation = scan.nextLine();
                dictionary.add(word, translation);
                continue;
            }
            if(command.equals("search")) {
                System.out.println("To be translated:");
                String translateWord = scan.nextLine();
                if(!(dictionary.contains(translateWord))) {
                    System.out.println("Word " + translateWord + " was not found");
                    continue;
                }
                System.out.println(dictionary.translate(translateWord));
                continue;
            }
            System.out.println("Uknown command");
        }
    }
}
