import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt user for three numbers
        System.out.print("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        
        // Display the numbers in increasing order
        displaySortedNumbers(num1, num2, num3);
        
        input.close();
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;
        
        // Sort the numbers using simple comparisons
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Display the sorted numbers
        System.out.println("The numbers in increasing order are: " + num1 + " " + num2 + " " + num3);
    }
}