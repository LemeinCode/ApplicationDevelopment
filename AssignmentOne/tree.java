public class tree {
    public static void main(String[] args) {
        //this is the number of rows to be printed
        int n = 4; 
        int i, j;

        // Print the top part of the tree
        for (i = 1; i <= n; i++) {
            // Print leading spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print 'X' characters without extra spaces
            for (j = 1; j <= i * 2 - 1; j++) {
                System.out.print("X");
            }

            // Move to the next line
            System.out.println();
        }

        // Print the bottom 'X' (trunk)
        for (j = 1; j <= n - 1; j++) {
            System.out.print(" "); // Center it
        }
        System.out.println("X"); // Print single 'X' for the trunk
    }
}
