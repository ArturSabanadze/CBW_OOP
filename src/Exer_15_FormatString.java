import java.sql.SQLOutput;

import static java.lang.String.format;

public class Exer_15_FormatString {
    public static void main(String[] args) {
        String no, title, genre, author, publ;

        String name = "Peter Pan";
        String location = "Neverland";


        System.out.println(name + " lebt in " + location);

        String line = String.format("%-40s lives in %-30s", name, location);
        System.out.println(line);

        name = "Pippi Langstrumpf";
        location = "Schweden";
        Integer number = 100;
        line = String.format("%-40s %-10d lives in %-30s", name, number, location);
        System.out.println(line);

        no = "001";
        title = "Dracula";
        genre = "007";
        author = "Bram Stocker";
        publ = "1897";
        line = String.format("%-6s%-25s%-6s%-25s%-8s", no, title, genre, author, publ);
        System.out.println(line);

        no = "002";
        title = "Pippi Langstrumpf";
        genre = "004";
        author = "Astrid Lindgren";
        publ = "1949";
        line = String.format("%-6s%-25s%-6s%-25s%-8s", no, title, genre, author, publ);
        System.out.println(line);

    }
}
