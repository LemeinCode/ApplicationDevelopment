public class diamond {
    public static void main(String[] args) {

        //stars is the numbers of rows in the top half
        int stars = 3; 

        int i , j;

        //this first loop prints the first and second row of the stars
        for ( i = 1; i <= stars + 1; i++) {
          
            for (j = 1; j <= stars + 1 - i; j++) {
                System.out.print(" ");
            }

            //here we print the star with a space for better alignment
            for ( j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Bottom half of the diamond
        for ( i = stars; i >= 1; i--) {
  
            for ( j = 1; j <= stars + 1 - i; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}