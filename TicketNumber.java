
public class TicketNumber {
    public static void main(String[] args) {


        // decalring the ticket numbers
        long TicketNumber1 = 12344321566L;

        long TicketNumber2 = 23234545678L;

        //this is to drop the last digit
        long TenTicketNumber1 = TicketNumber1 / 10;
        int lastDigit1 = (int)(TicketNumber1 % 10);

         // Computing modulus
         int remainder1 = (int)(TenTicketNumber1 % 7);


        System.out.println("The original ticket number is "+TicketNumber1 );
        System.out.println("The first ten digits of the ticket number one are " +TenTicketNumber1 );
        System.out.println("The last digit is "+lastDigit1 );
        System.out.println("The modulus of the first ten digits (mod 7): " + remainder1);

        // Checking if the modulus matches the dropped last digit
        if (remainder1 == lastDigit1) {
            System.out.println("✅ The modulus matches the last digit!");
        } else {
            System.out.println("❌ The modulus does NOT match the last digit.");
        }

        //this is to drop the last digit
        long TenTicketNumber2 = TicketNumber2 / 10;
        int lastDigit2 = (int)(TicketNumber2 % 10);

         // Computing modulus
         int remainder2 = (int)(TenTicketNumber2 % 7);


        System.out.println("The original ticket number is "+TicketNumber2 );
        System.out.println("The first ten digits of the ticket number one are " +TenTicketNumber2 );
        System.out.println("The last digit is "+lastDigit2 );
        System.out.println("The modulus of the first ten digits (mod 7): " + remainder2);

        // Checking if the modulus matches the dropped last digit
        if (remainder2 == lastDigit2) {
            System.out.println("✅ The modulus matches the last digit!");
        } else {
            System.out.println("❌ The modulus does NOT match the last digit.");
        }
        }

    }
