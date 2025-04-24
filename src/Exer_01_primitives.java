
public class Exer_01_primitives {

    public static int add (int a, int b, int c) {
        return a + b + c;
    }
    public static int substract (int a, int b, int c) {
        return a - b - c;
    }
    public static int multiply (int a, int b, int c) {
        return a * b * c;
    }
    public static int divide (int a, int b, int c) {
        return a / b / c;
    }
    public static int modulo (int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        System.out.println("Ergebniss Addition: " + add(5, 10, 15));
        System.out.println("Ergebniss Subtraktion: " + substract(8, 2, 3));
        System.out.println("Ergebniss Multiplikation: " + multiply(2, 3, 4));
        System.out.println("Ergebniss Division: " + divide(20, 4, 5));
        System.out.println("Ergebniss Modulo: " + modulo(29, 3));
    }
}
