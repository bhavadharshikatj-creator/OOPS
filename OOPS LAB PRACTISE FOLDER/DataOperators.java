public class DataOperators
{
    public static void main(String[] args)
    {
        int a = 10, b = 5;

        
        System.out.println("Arithmetic Operators");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        
        System.out.println("\nRelational Operators");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        
        System.out.println("\nLogical Operators");
        System.out.println("(a>0 && b>0) : " + (a > 0 && b > 0));
        System.out.println("(a>0 || b<0) : " + (a > 0 || b < 0));
        System.out.println("!(a>b) : " + !(a > b));

        
        System.out.println("\nAssignment Operators");
        int x = 10;
        x += 5;
        System.out.println("x += 5 : " + x);
        x -= 3;
        System.out.println("x -= 3 : " + x);
        x *= 2;
        System.out.println("x *= 2 : " + x);
        x /= 4;
        System.out.println("x /= 4 : " + x);

        
        System.out.println("\nUnary Operators");
        int y = 5;
        System.out.println("y : " + y);
        System.out.println("y++ : " + (y++));
        System.out.println("++y : " + (++y));
        System.out.println("y-- : " + (y--));

        
        System.out.println("\nBitwise Operators");
        System.out.println("a & b : " + (a & b));
        System.out.println("a | b : " + (a | b));
        System.out.println("a ^ b : " + (a ^ b));
        System.out.println("~a : " + (~a));

        
        System.out.println("\nTernary Operator");
        int max = (a > b) ? a : b;
        System.out.println("Maximum number is: " + max);
    }
}