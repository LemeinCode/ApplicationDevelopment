public class CharacterCounter {
    public static void main(String[] args){

        String text1 = " Aa kiu, I swd skieo 236587. GH kiu: sieo??25.33";

        int letters = 0, spaces = 0, numbers = 0, othercharacters = 0;

        for (char ch : text1.toCharArray()){
            if (Character.isLetter(ch)){
                letters++;
            }
            else if (Character.isDigit(ch)){
                numbers++;
            }
            else if (Character.isWhitespace(ch)){
                spaces++;
            }

            else {
                othercharacters++;
            }

        }

        System.out.println("The whole sentences is: "+ text1);
        System.out.println("The total number of letters in text 1 is : "+ letters);
        System.out.println("The total number of digits in text 1 is  "+ numbers);
        System.out.println("The total number of spaces in text 1 is "+ spaces);
        System.out.println("The total number of the other characters: "+ othercharacters);

    }
}