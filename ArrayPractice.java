import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] arg0) {
        Student bill = new Student("Bill", 2, 3.25, 6, "billybob@gmail.com");
        Student sally = new Student("Sally", 6, 3.4, 6, "sally123@gmail.com");
        Student eric = new Student("Eric", 10, 4.0, 10, "notmyemailaddress@gmail.com");
        Student[] allStudents = {bill, sally, eric};

        for (Student student : allStudents) {
            System.out.println(student + "\n");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many integers would you like to input?");
        int numberOfIntegers = scanner.nextInt();
        System.out.println("Okay, start inputting");
        int[] integerArray = new int[numberOfIntegers];
        for (int i = 0; i < numberOfIntegers; i++) {
            integerArray[i] = scanner.nextInt();
        }

        for (int inputtedInteger : integerArray) {
            System.out.println(inputtedInteger % 2 == 0);
        }
    }
}
