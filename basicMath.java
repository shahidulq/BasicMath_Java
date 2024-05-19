
public class basicMath {

    public static void add(double a, double b) {
        
        double c = (a + b);
        System.out.println("Sum = "+c);
    }
    public static void subtract(double a, double b) {
        
        double c = (a - b);
        System.out.println("Difference = "+c);
    }
    public static void product(double a, double b) {
        
        double c = (a * b);
        System.out.println("Product = "+c);
    }
    public static void divide(double a, double b) {
        
        double c = (a / b);
        System.out.println("Quotient = "+c);
    }
    public static void modulus(double a, double b) {
        
        double c = (a-((int)(a / b))* b);
        System.out.println("Modulus = "+c);
    }
    public static void min(double a, double b) {
        
        if (a<b) {
            System.out.println("Min = "+a);
        } else {
            System.out.println("Min = "+b);
        }
    }    
    public static void max(double a, double b) {
        
        if (a>b) {
            System.out.println("Max = "+a);
        } else {
            System.out.println("Max = "+b);
        }
    }
}
