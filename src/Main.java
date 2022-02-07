import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program to test the average execution time of removeDuplicateFromArrayList method.
 * User will provide both the list size and number of time to execute.
 * Based on user input the average execution time is displayed.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Long> executionTimes = new ArrayList<>();
        // Take input from user on email list size
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of randomEmail List");
        int emailListSize = sc.nextInt();

        // Take input from user on how much time to loop removeDuplicate function to test average execution time
        System.out.println("How many times you want to test the RemoveDuplicate Function?[We will give you average run time in millisecond]");
        int maxLoopCount = sc.nextInt();

        RandomListGenerator randomListGenerator = new RandomListGenerator();
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();

        //executes the removeDuplicateFromArrayList method for maxLoopCount number of time
        for (int i = 0; i < maxLoopCount; i++) {
            ArrayList<String> randomList = randomListGenerator.generateRandomEmail(emailListSize);
            long start = System.currentTimeMillis();
            ArrayList<String> noDuplicatedList = removeDuplicate.removeDuplicateFromArrayList(randomList);
            long stop = System.currentTimeMillis();
            long timeTaken = stop - start;
            executionTimes.add(timeTaken);
        }

        //calculate average execution time in millisecond
        double average = executionTimes.stream().mapToLong(number -> number).average().getAsDouble();
        System.out.println("Average is: " + average + " millisecond");

    }
}
