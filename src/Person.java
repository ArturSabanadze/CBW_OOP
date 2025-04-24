public class Person {
    // Eigenschaften
    String name;
    String vorname;
    int age;

    // Methoden
    void getName() {
        System.out.println("Name: " + name);
    }
    void getVorname() {
        System.out.println("Vorname: " + vorname);
    }
    void getAge() {
        System.out.println("Alter: " + age);
    }

    static class Main {
        public static void main(String[] args) {
            Person person = new Person();
            person.name = "Sabanadze";
            person.vorname = "Artur";
            person.age = 39;

            person.getName();
            person.getVorname();
            person.getAge();
        }
    }
}
