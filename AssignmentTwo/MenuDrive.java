import java.util.Scanner;

public class MenuDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        
        do {
            // Display available menu options for selecting different geometric shapes.
            System.out.println("\nEnter Menu Options:");
            System.out.println("a) Rectangle");
            System.out.println("b) Circle");
            System.out.println("c) Parallelogram");
            System.out.println("d) Cylinder");
            System.out.println("e) Hexagon");
            System.out.println("f) Triangle");
            System.out.println("g) Trapezium");
            System.out.println("h) Exit");
            System.out.print("Enter Input: ");
            
            //this statement gets the user's selected choice and assigns it to choice
            choice = scanner.next().charAt(0);
            
            //based on the choice selected we execute the corresponding calculation method 
            switch (choice) {
                case 'a': rectangle(scanner); break;
                case 'b': circle(scanner); break;
                case 'c': parallelogram(scanner); break;
                case 'd': cylinder(scanner); break;
                case 'e': hexagon(scanner); break;
                case 'f': triangle(scanner); break;
                case 'g': trapezium(scanner); break;
                case 'x': System.out.println("Exit program"); break;
                default: System.out.println("Invalid choice, please try again.");
            }
            //if the choice is x then we exits the proram
        } while (choice != 'x');
        
        scanner.close();
    }

    // Calculate area, perimeter, and diagonal of a rectangle
    public static void rectangle(Scanner scanner) {
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        System.out.println("Area: " + (length * width));
        System.out.println("Perimeter: " + (2 * (length + width)));
        System.out.println("Diagonal: " + Math.sqrt(length * length + width * width));
    }

    // Calculate area and circumference of a circle
    public static void circle(Scanner scanner) {
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        System.out.println("Area: " + (Math.PI * radius * radius));
        System.out.println("Circumference: " + (2 * Math.PI * radius));
    }

    // Calculate area of a parallelogram
    public static void parallelogram(Scanner scanner) {
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        System.out.println("Area: " + (base * height));
    }

    // Calculate surface area and volume of a cylinder
    public static void cylinder(Scanner scanner) {
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        System.out.println("Surface Area: " + (2 * Math.PI * radius * (radius + height)));
        System.out.println("Volume: " + (Math.PI * radius * radius * height));
    }

    // Calculate area of a hexagon
    public static void hexagon(Scanner scanner) {
        System.out.print("Enter side length: ");
        double side = scanner.nextDouble();
        System.out.println("Area: " + ((3 * Math.sqrt(3) * side * side) / 2));
    }

    // Calculate area of a triangle
    public static void triangle(Scanner scanner) {
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        System.out.println("Area: " + (0.5 * base * height));
    }

    // Calculate area of a trapezium
    public static void trapezium(Scanner scanner) {
        System.out.print("Enter base 1: ");
        double base1 = scanner.nextDouble();
        System.out.print("Enter base 2: ");
        double base2 = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        System.out.println("Area: " + (((base1 + base2) / 2) * height));
    }
}
