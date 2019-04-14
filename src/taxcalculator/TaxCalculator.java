
package taxcalculator;

import java.util.Scanner;

public class TaxCalculator {
int salary ;
    public static double calculateTax(double salary) {
        double tax = 0;
        if (salary <= 200000) {
            tax = (salary / 100) * 1;
        } else if (salary > 200000 && salary <= 350000) {
            double firstTax = (200000 / 100) * 1;
            double remainingAmount = salary - 200000;
            double secondTax = (remainingAmount / 100) * 15;
            tax = firstTax + secondTax;
        } else if (salary > 350000) {
            double firstTax = (200000 / 100) * 1;
            double secondTax = (150000 / 100) * 15;
            double remainingAmount = salary - 350000;
            double thirdTax = (remainingAmount/100)*25;
            tax = firstTax + secondTax + thirdTax;
        }
        return tax;
        }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
    System.out.println("Please enter your income: ");
        Scanner theScanner = new Scanner(System.in);
        double salary = theScanner.nextDouble();
        System.out.println(calculateTax((double)salary));

    }
    }
    
