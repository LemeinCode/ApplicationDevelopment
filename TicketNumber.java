
public class TicketNumber {
    public static void main(String[] args) {


        // decalring the ticket numbers
        long TicketNumber1 = 12344321566L;

        long TicketNumber2 = 23234545678L;

        long TenTicketNumber1 = TicketNumber1 / 10;
        int lastDigit1 = (int)(TicketNumber1 % 10);
        int remainder1 = (int)(TenTicketNumber1 % 7);

        System.out.println("The ticket number is "+TicketNumber1 );
        System.out.println("The first ten digits of the ticket number one are "+TenTicketNumber1 );

        
        }

    }
