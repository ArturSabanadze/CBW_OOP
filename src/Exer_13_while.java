import java.util.Objects;
import java.util.Scanner;

public class Exer_13_while {

    static Book dracula = new Book("Dracula", 500, "Bram Stoker");
    static Book frankenstein = new Book("Frankenstein", 300, "Mary Shelley");
    static Book mummy = new Book("Mummy", 400, "Anne Rice");
    static DigitalBook draculaDigital = new DigitalBook("Dracula - Digital", 500, "Bram Stoker", "https://example.com/drakula.pdf");

    private static void printBookHeader() {
        System.out.printf("%-20s %-10s %-20s %-20s\n", "Title", "Pages", "Author", "Download link");
        System.out.println("=========================================================================\n");
    }
    private static void printBookFooter() {
        System.out.println("=========================================================================");
    }
    public static void bookScannerInitialization() {
        Scanner input = new Scanner(System.in);
        String title;

        while (true) {
            System.out.print("Buch Title eingeben\n"+ "-zum beenden: 'exit'\n" + "-zum anzeigen aller Bücher: 'all'\n" + "Buch Title: ");
            title = input.nextLine().toLowerCase();

            if (Objects.equals(title, "exit")) {
                break;
            }
            else if (Objects.equals(title, "all")) {
                printBookHeader();
                dracula.overview();
                frankenstein.overview();
                mummy.overview();
                draculaDigital.overview();
                printBookFooter();
                continue;
            }

            boolean found = false;
            if (dracula.getTitle().toLowerCase().startsWith(title.toLowerCase()) && title.length() >= 4) {
                printBookHeader();
                dracula.overview();
                printBookFooter();
                found = true;
            } else if (frankenstein.getTitle().toLowerCase().startsWith(title.toLowerCase()) && title.length() >= 4) {
                printBookHeader();
                frankenstein.overview();
                printBookFooter();
                found = true;
            } else if (mummy.getTitle().toLowerCase().startsWith(title.toLowerCase()) && title.length() >= 4) {
                printBookHeader();
                mummy.overview();
                printBookFooter();
                found = true;
            }
            else if (draculaDigital.getTitle().toLowerCase().startsWith(title.toLowerCase()) && title.length() >= 4) {
                printBookHeader();
                draculaDigital.overview();
                printBookFooter();
                found = true;
            }

            if (!found) {
                System.out.println("Dieses Buch existiert nicht in der Datenbank.");
            }
        }

        input.close();
    }

    public static void main(String[] args) {
        bookScannerInitialization();
    }

}
