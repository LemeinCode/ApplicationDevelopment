public class DivisibleNumbers {
    public static void main(String[] args) {
        // Print numbers divisible by 3
        System.out.print("Divided by 3: ");
        boolean first = true;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                if (!first) System.out.print(", ");
                System.out.print(i);
                first = false;
            }
        }
        System.out.println();
        
        // Print numbers divisible by 5
        System.out.print("Divided by 5: ");
        first = true;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                if (!first) System.out.print(", ");
                System.out.print(i);
                first = false;
            }
        }
        System.out.println();
        
        // Print numbers divisible by both 3 and 5
        System.out.print("Divided by 3 & 5: ");
        first = true;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                if (!first) System.out.print(", ");
                System.out.print(i);
                first = false;
            }
        }
        System.out.println();
    }
}
