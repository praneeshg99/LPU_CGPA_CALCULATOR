import java.util.Scanner;

public class IntegerDivision {
    public static int divide(int dividend, int divisor) {
      
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;  // -2147483648 to  2147483648 
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);

        
        long absoluteDividend = Math.abs((long) dividend);
        long absoluteDivisor = Math.abs((long) divisor);

        long result = 0;
        while (absoluteDividend >= absoluteDivisor) {
            long tempDivisor = absoluteDivisor;
            long multiple = 1;

            while (absoluteDividend >= (tempDivisor + tempDivisor)) {
                tempDivisor = tempDivisor + tempDivisor;
                multiple = multiple + multiple;
            }

            
            absoluteDividend = absoluteDividend - tempDivisor;

            
            result = result + multiple;
        }

        if (negative) {
            result = -result;
        }

     
        return (int) result;
    }

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Divident:");
        int dividend1 = sc.nextInt();

        System.out.println("Enter the Divisor:");
        int divisor1  = sc.nextInt();

        int quotient = divide(dividend1, divisor1); 
        
        System.out.println("Quotient is: " + quotient);

        // Close the scanner
        sc.close();


        
    }
}
