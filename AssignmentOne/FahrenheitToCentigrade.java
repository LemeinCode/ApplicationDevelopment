public class FahrenheitToCentigrade {
    public static void main(String[] args) {
        
        double fahrenheit = 98.6;

        
        double centigrade = (5.0 / 9.0) * (fahrenheit - 32);

        // Print the result
        System.out.println("Fahrenheit Temperature: " + fahrenheit + "°F");
        System.out.println("Converted to Centigrade: " + centigrade + "°C");
    }
}
