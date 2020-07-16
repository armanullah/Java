
/*
 * Class: CMSC201
 * Instructor:
 * Description: (Give a brief description for each Program)
 * Due: 03/01/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Arman Khan
*/

public class Main {

    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];

        for (int i = 0; i < 100; i++) {  // student 1 opens all lockers to start
            lockers[i] = true;
        }

        for (int s = 2; s <= 100; s++) {
            for (int locker = s - 1; locker < 100; locker += s) {
                if (lockers[locker]) {
                    lockers[locker] = false;    // change lockers[locker] (open if closed, close if opened)
                } else {
                    lockers[locker] = true;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            if (lockers[i]) {
                System.out.println("Locker " + (i + 1) + " is open");
            }
        }
    }

}



