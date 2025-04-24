import javax.swing.*;
import java.util.Scanner;

public class Vereinsverwaltung
{
    public static void main(String[] args)
    {
        MitgliedVerwaltung mV = new MitgliedVerwaltung();

        Scanner scanner = new Scanner(System.in);

        int id_Nummer;
        String nachname;
        String vorname;
        int alter;


        while(true)
        {
            System.out.print("\nGeben Sie die Id_Nummer ein: ");
            id_Nummer = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Geben Sie den Nachnamen ein: ");
            nachname = scanner.nextLine();

            System.out.print("Geben Sie den Vornamen ein: ");
            vorname = scanner.nextLine();

            System.out.print("Geben Sie das Alter ein: ");
            alter = scanner.nextInt();
            scanner.nextLine();

            Mitglied member = new Mitglied(id_Nummer, nachname, vorname, alter);

            mV.addMitglied(member);

            String antwort = mV.bestätigungFragen(scanner);

            if(antwort.equalsIgnoreCase("n"))
            {
                System.out.println("\nMöchten Sie die Mitgliederliste anzeigen? ");
                break;
            }
        }

        String auswahl = mV.bestätigungFragen(scanner);

        if(auswahl.equalsIgnoreCase("n"))
        {
            System.out.println("\nProgramm wird beendet. Danke!");
        }
        else
        {
            mV.anzeigen();
        }
        scanner.close();
    }
}
