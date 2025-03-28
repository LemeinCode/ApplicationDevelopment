public class Prime {
    public static void main(String[] args) {

        //this limits the prime numbers we get to 200
        printPrimeNumbers(200);
    }

    // this function uses the method isPrime to check if a number isPrime
    public static boolean isPrime(int number) {
        //here i am hardcoding to make sure it doesnt return 0,1 or 2 
        if (number < 2) return false; 
        for (int i = 2; i * i <= number; i++) { 
            if (number % i == 0) return false;
        }
        return true;
    }

    // Function to print prime numbers up to  200 
    public static void printPrimeNumbers(int limit) {
        // Counter to track numbers per line
        int count = 0; 
        
        for (int num = 1; num <= limit; num++) {
            if (isPrime(num)) {
                // here we display the number if the number is prime, if not we skip it
                System.out.printf("%-4d", num); 
                count++;

                //hapa we print a new line after listing 10 prime numbers
                if (count % 10 == 0) { 
                    System.out.println();
                }
            }
        }
        // Ensure output ends with a new line
        System.out.println(); 
    }
}
