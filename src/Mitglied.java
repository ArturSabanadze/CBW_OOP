import java.util.Scanner;

public class Mitglied {

    private int idNummer;
    private String nachname;
    private String vorname;
    int alter;


    public Mitglied(int idNummer, String nachname, String vorname, int alter)
    {
        this.idNummer = idNummer;
        this.nachname = nachname;
        this.vorname = vorname;
        this.alter = alter;
    }

    public int getAlter() {
        return alter;
    }

    public String formatZeile()
    {
        return String.format("%-10s%-20s%-15s%-5s%n",idNummer, nachname, vorname, alter);
    }
}
