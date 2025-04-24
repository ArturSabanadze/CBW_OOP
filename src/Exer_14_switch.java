import java.util.Objects;
import java.util.Scanner;

public class Exer_14_switch {


    public static String selectDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day of week");
        String day = scanner.nextLine();
        return day;
    }



    public static void what_todo_on(String day) {
        switch(day) {
            case "Monday":
                System.out.println("Nummer ist 1");
                break;
            case "Tuesday":
                System.out.println("Di Jogging");
                break;
            case "3":
                System.out.println("Nummer ist 3");
                break;
            case "4":
                System.out.println("Nummer ist 4");
                break;
            case "5":
                System.out.println("Nummer ist 5");
                break;
            case "6":
                System.out.println("Nummer ist 6");
                break;
            default:
                System.out.println("Nummer nicht vorhanden");
        }


    }


    public static void main(String[] args) {
        /*
        Steuer- Ablauf-Elemente:

        if Abfrage: Verzeigung
        switch: bei Abfragen mit mehreren Lösungen (>2)

        for loop: Definierte oder bekannte Anzahl von Loops
        while loop: in Verbindung mit Abbruchbedingung
        while(true) : unendliche while-loop, wird über break beendet
         */

        int number = 45;
        //String day;

        String day = selectDay();

        while (true) {
           if (Objects.equals(day, "quit"))
                break;
            what_todo_on(day);
        } //end while

        }


}
