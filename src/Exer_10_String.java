public class Exer_10_String {
    public static void main(String[] args) {
        int count;
        String name;
       /*
        1. Perform initialization, before the first semicolon.
        2. Test the condition in between the first and second semicolons.
        If the condition is false, break out of the loop.
        3. Execute the body of the loop.
        4. Perform the statement after the second semicolon (the increment).
        5. Go back to Step 2.
        */
        // array [1, 2, 3, 4] sout(array[2])
        for (int i=1; i <= 10; i++) {
            System.out.println("i: " + i);
        }
        for (int i=10; i > 0; i-=1) { // i = i-2;
            System.out.println("i: " + i);
            if (i == 7) {
                break;
            }
        }
        int number = 3;
        // 7 * 7
        for (int j=1; j <= 5; j++) {
            System.out.println("j: " + j);
         }

        }


    }



