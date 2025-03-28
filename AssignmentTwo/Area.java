public class Area {
    public static void main(String[] args) {

        int numsides = 7;
        int length = 6;

        double area = (numsides * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / numsides));

        System.out.println("The area is: " + area);
    }
}
