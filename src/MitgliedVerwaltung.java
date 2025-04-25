import java.util.ArrayList;
import java.util.Scanner;

public class MitgliedVerwaltung {

    private ArrayList<Mitglied> mitgliedListe = new ArrayList<>();

    public void addMitglied(Mitglied member)
    {
        mitgliedListe.add(member);
    }


    public void anzeigen() {
        System.out.println ("---------------------------------------------------");
        System.out.printf  ("%-10s%-20s%-15s%-5s\n","ID", "Nachname", "Vorname", "Alter");
        System.out.println ("---------------------------------------------------");
        for (Mitglied m : mitgliedListe)
        {
            System.out.println(m.formatZeile());
        }
    }

    public String bestaetigungFragen(Scanner scanner) {
        String antwort;

        while(true) {
            System.out.print("\nMöchten Sie noch einmal versuchen? (j/n): ");
            antwort = scanner.nextLine();

            if(antwort.equalsIgnoreCase("j") || antwort.equalsIgnoreCase("n")) {
                return antwort;
            }
            else {
                System.out.println("\nUngültige Eingabe. Bitte nur 'j' oder 'n' eingeben.");
            }
        }
    }
}
