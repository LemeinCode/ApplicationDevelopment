public class ReverseString {
    public static void main(String[] args){
        String text2 = "The quick brown fox";

        char [] arr = text2.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--)
        System.out.print(arr[i]) ;

    }
}
