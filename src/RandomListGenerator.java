import java.util.ArrayList;

public class RandomListGenerator {
    /**
     * Generates the random ArrayList of emails of a given size.
     * The randomness of email being duplicate is more than 50%.
     *
     * @param size total number of random Email needed
     * @return arraylist of string of randomly generated email with probability of dupicate entry being more than 50%
     */
    public ArrayList<String> generateRandomEmail(int size) {
        ArrayList<String> randomList = new ArrayList<>();
        int randomRange = size / 2;
        for (int i = 0; i < size; i++) {
            randomList.add("basnetyub" + generateRandomIntForRange(randomRange) + "@gmail.com");
        }
        return randomList;
    }

    /**
     * Generates the random integer whose value is less than given aboveCeilingValue Param
     *
     * @param aboveCeilingValue the maximum+1 int that the function can written.
     * @return integer value range from 0 to aboveCeilingValue-1
     */
    private int generateRandomIntForRange(int aboveCeilingValue) {
        return ((int) Math.floor(Math.random() * aboveCeilingValue));
    }
}
