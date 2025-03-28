public class ThreeNums {
    public static void main(String[] args) {
        //initialise the total number of the count to start from 0
        int count = 0; 

        // Pick the first number (i)
        for (int i = 1; i <= 4; i++) {
            // Pick the second number (j), making sure it's different from i
            for (int j = 1; j <= 4; j++) {
                if (j == i) continue; 

                // Pick the third number (k), making sure it's different from i and j
                for (int k = 1; k <= 4; k++) {
                    if (k == i || k == j) continue; 

                    // Print the unique three-digit number
                    System.out.print(i + " " + j + " " + k + ", ");
                    count++;

                }
            }
        }

        // Print the total number of unique numbers found
        System.out.println("\nTotal number of unique three-digit numbers: " + count);
    }
}