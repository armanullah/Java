/**
 * This Set of questions was created as a review guide for the Introduction to
 Java Midterm Exam.
 * Please remember that all questions on here will not represent all questions
 on the exam,
 * nor does this mean that questions absent from here wont be on the Midterm.
 */
/*
--------------------------------------------------------------------------
-------------------------------
* Question # 1.
* What is a sentinel Value?
*
-------------------------------------------------------------------------
--------------------------------
*/
/**
 * Answer is: A sentinel value helps you determine the end of a loop.
 */
/*
*
-------------------------------------------------------------------------
--------------------------------
* Question # 2. You can always convert a for loop to a while loop.
* a. true
* b. false
* */
/**
 * Answer is: False
 */
/*
*
-------------------------------------------------------------------------
--------------------------------
* Question # 3.
* What is a nested for loop?
* A. a for loop within a for loop
* B. a for loop within an if-statement
* C. an if-statement within a for loop
*
-------------------------------------------------------------------------
--------------------------------
*/
/**
 * Answer is: A.
 */
/*
*
-------------------------------------------------------------------------
--------------------------------
* Question # 4.
* What are variables used for?
*
        */
/**
 * Answer is:
 */
/*
*
-------------------------------------------------------------------------
--------------------------------
* Question # 5
* What will the following code display?
*
-------------------------------------------------------------------------
--------------------------------
*/
public static void main(String[] args){
        int x = 5;
        int y = 2;
        x = y++;
        ++x;
        System.out.println(x++);
        }
/**
 * Output: 3
 */
/*
 * Question # 6
 * What will the following code display?
 */
public static void main(String[] args){
        String size = "this is my size!", str = "*-*-|";
        for(int index = 0; index < size.length(); index++){
        System.out.print(str);
        if(index == size.length() - 1){
        System.out.print(str.replace("|", ""));
        }
        }
        }
/**
 * Answer: *-*-|*-*-|*-*-|*-*-|*-*-|*-*-|*-*-|*-*-|*-*-|*-*-|*-*-|*-*-|*-*-|*-*-|*-*-|*-*-|*-*-
 */
/*
--------------------------------------------------------------------------
-------------------------------
* Question # 7. Based on the following code what will be the output?
*
* C. value1 is true value2 is true.
*
-------------------------------------------------------------------------
--------------------------------
*/
        boolean value1 = true, value2 = false;
        if(value1 == true){
        System.out.println("value1 is: " + value1);
        if(value2 = true){
        System.out.println("value2 is: " + value2);
        }
        else{
        System.out.println("value2 is: " + value1);
        }
        }
        else{
        System.out.println("value1 is: " + value1);
        }
// Answer: C
/*
--------------------------------------------------------------------------
-------------------------------
* Question # 8. Based on the following code what will be the output of
sum?
* A. 25
* B. 34
* C. 40
* D. none of the above
*
-------------------------------------------------------------------------
--------------------------------
*/
        int x = 5, y =0, z = 0, sum = 0;
        while(x < 8){
        x++;
        y += x++;
        if(y > x){
        z += 2;
        }
        }
        sum = x + y + z;
        System.out.println(sum);

//Answer: A. 25
/* Problems 9-10 will require you to finish the code.
*
-------------------------------------------------------------------------
---------------------------------
* Question # 9.Finish the code by writing a switch statement that will
give the user legos if they are 6, a
* bike if they are 12 and a new car if they are 18, if none of these
conditions are met the user gets nothing.
*
-------------------------------------------------------------------------
--------------------------------
*
*/
public static void main(String[] args){
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age.");
        age = input.nextInt();


        }
//Answer: switch(age) {
            case 6:
                System.out.println("You get legos.");
                break;
            case 12:
                System.out.println("you get a bike");
                break;
            case 18:
                System.out.println("You get a car");
                break;

                default:
                    System.out.println("You get nothing");
                break;

/*
*
-------------------------------------------------------------------------
---------------------------------
* Question # 10.Finish the code by writing if-else statements that will.
* 1. Display the word baby if the user is or between 0 and 3.
* 2. Display the word child if the user is or between 4 and 9.
* 3. Display the word pre-teen if the user is or between 10 and 13.
* 4. Display the word teen if the user is or between 14 an 17.
* 5. Display the word young adult if the user is or between 18 and 23.
* 6. if none of the above conditions are met then they are an adult.
*
-------------------------------------------------------------------------
--------------------------------
*/
public static void main(String[] args){
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age.");
        age = input.nextInt();
        }
/*
Answer:
        if(age <= 3 && age >=0) {
        System.out.println("baby");
        } else if (age > 3 && age < 10) {
        System.out.println("child");
        } else if (age > 9 && age < 14) {
        System.out.println("pre-teen");
        } else if (age >13 && age <18) {
        System.out.println("teen");
        } else if (age > 17 && age < 24) {
        System.out.println("Young adult");
        } else {
        System.out.println("adult");
        }
*/
/*Questions 11-14 Predict output
*
-------------------------------------------------------------------------
--------------------------------
* Question # 11. Based on the following code what will be the output ?
*
*
-------------------------------------------------------------------------
--------------------------------
*/
public class Test {
    public static void main(String[] args) {
        int max = 0;
        max(1, 2, max);
        System.out.println(max);
    }
    public static void max(
            int value1, int value2, int max) {
        if (value1 > value2)
            max = value1;
        else
            max = value2;
    }
}
//Answer: 0
/*
--------------------------------------------------------------------------
-------------------------------
* Question # 12. Based on the following code what will be the output?
*
*
-------------------------------------------------------------------------
4
Assignment_Review_for_MidTerm.java 2/23/2019
-------------------------------------------------------------------------
--------------------------------
*/
public class Test {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 6) {
            method1(i, 2);
            i++;
        }
    }
    public static void method1(
            int i, int num) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num *= 2;
        }
        System.out.println();
    }
}
//Answer:
        2
        2 4
        2 4 8
        2 4 8 16
        2 4 8 16 32
        2 4 8 16 32 64
/*
--------------------------------------------------------------------------
-------------------------------
* Question # 13. Based on the following code what will be the output?
* A.
* B.
* C.
* D. none of the above
*
-------------------------------------------------------------------------
--------------------------------
*/
public class Test {
    public static void main(String[] args) {
// Initialize times
        int times = 3;
        System.out.println("Before the call,"
                + " variable times is " + times);
// Invoke nPrintln and display times
        nPrintln("Welcome to Java!", times);
        System.out.println("After the call,"
                + " variable times is " + times);
    }
    // Print the message n times
    public static void nPrintln(
            String message, int n) {
        while (n > 0) {
            System.out.println("n = " + n);
            System.out.println(message);
            n--;
        }
    }
}
/* Answer:
 */
       /* Before the call, variable times is 3
        n = 3
        Welcome to Java!
        n = 2
        Welcome to Java!
        n = 1
        Welcome to Java!
        After the call, variable times is 3
/*
--------------------------------------------------------------------------
-------------------------------
* Question # 14. Based on the following code what will be the output?
*
5
Assignment_Review_for_MidTerm.java 2/23/2019
*
-------------------------------------------------------------------------
--------------------------------
*/
public class Test {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 4) {
            method1(i);
            i++;
        }
        System.out.println("i is " + i);
    }
    public static void method1(int i) {
        do {
            if (i % 3 != 0)
                System.out.print(i + " ");
            i--;
        }
        while (i >= 1);
        System.out.println();
    }
}
/*Anwer: */
/*
            1
            2 1
            2 1
            4 2 1
            i is 5 */
/*
--------------------------------------------------------------------------
-------------------------------
* Question # 15. Rewrite the following if statements using the
conditional operator.
*
*
-------------------------------------------------------------------------
--------------------------------
*/
if (ages >= 16)
        ticketPrice = 20;
        else
        ticketPrice = 10;
        /*Answer:

        ticketPrice = (ages >= 16) ?  20 : 10;
         */
/*
--------------------------------------------------------------------------
-------------------------------
* Question # 16. Rewrite the following conditional expressions using if else statements.
*
*
-------------------------------------------------------------------------
--------------------------------
*/
//a.
        score = (x > 10) ? 3 * scale : 4 * scale;
//a Answer: if(x > 10)
               score = 3*scale;
               else
               score = 4*scale;

//b.
        b. tax = (income > 10000) ? income * 0.2 : income * 0.17 + 1000;
//b Answer: if(income > 10000)
                tax = income * 0.2;
                else
                tax = income * 0.17 + 1000;

//c
        System.out.println((number % 3 == 0) ? i : j);
//c Answer:
        if(number%3 == 0) {
            System.out.print(i);
        } else {
            System.out.print(j);
        }

/*
--------------------------------------------------------------------------
-------------------------------
* Question # 17. Convert the following for loop statement to a while loop
and to a do-while loop:
*
*
-------------------------------------------------------------------------
--------------------------------
*/
        long sum = 0;
        for (int i = 0; i <= 1000; i++)
        sum = sum + i;
//Answer:
        long sum = 0;
        int i = 0;
        while(i <= 1000) {
            i++;
            sum += i;
        }

        /* Question #17 Show the output.*/
        for (int i = 1; i < 4; i++) {
        for (int j = 1; j < 4; j++) {
        if (i * j > 2)
        break;
        System.out.println(i * j);
        }
        System.out.println(i);
        }
//Answer for a while loop
        int i = 1;
        int j = 1;

        while (i < 4) {
            i++;
            while (j < 4) {
                j++;
                if (i * j > 2)
                break;
                System.out.println(i * j);
            }
            System.out.println(i);
        }
//Answer for a do-while loop:
        int i = 1;
        int j = 1;

         do {
            i++;
            do {
                j++;
                if (i * j > 2)
                break;
                System.out.println(i * j);
                }while (j < 4);
                System.out.println(i);
        } while (i < 4);
/*
--------------------------------------------------------------------------
-------------------------------
* Question # 18. Sort three numbers) Write a method with the following
header
to display three numbers in increasing order. Write a test program that
prompts
the user to enter three numbers
and invokes the method to display them in increasing order.
*
*
-------------------------------------------------------------------------
--------------------------------
*/
public static void displaySortedNumbers(
        double num1, double num2, double num3)
//Answer:
Scanner stdin = new Scanner(System.in);

public static void displaySortedNumbers(double num1, double num2, double num3){

        System.out.println("Enter 3 numbers. ");

        num1=stdin.nextDouble();
        num2=stdin.nextDouble();
        num3=stdin.nextDouble();


        if(num1>num2){
        double temp=num1;
        num1=num2;
        num2=temp;
        }

        if(num2>num3){
        double temp=num2;
        num2=num3;
        num3=temp;
        }

        if(num1>num2){
        double temp=num1;
        num1=num2;
        num2=temp;
        }

        System.out.printf("The number in increasing order are: %f, %f, %f%n", num1, num2, num3);

        }




/*
--------------------------------------------------------------------------
-------------------------------
* Question # 19. Based on the following code what will be the output?
* A. false, false, true
* B. false, true, true
* C. true, false, true
* D. true, true, true
*
-------------------------------------------------------------------------
--------------------------------
*/
public class BooleanResultsOutput {
    public static void main(String[] args) {
        boolean booleanValue1 = true;
        boolean booleanValue2 = false;
        System.out.println(!(booleanValue1 & !booleanValue2) + ", ");
        System.out.println(!(booleanValue1 | !booleanValue2) + ", ");
        System.out.println(!(booleanValue1 ^ !booleanValue2));
    }
}
//Answer: A.
/*
--------------------------------------------------------------------------
-------------------------------
* Question 20 Given two method definitions,
*/------------------------------------------------------------------------
        ---------------------------------
public static double m(double x, double y)
public static double m(int x, double y)
// tell which of the two methods is invoked for:

        a. double z = m(4, 5);
        b. double z = m(4, 5.4);
        c. double z = m(4.5, 5.4);
//Answer:
a. second method
b. second method
c. first method