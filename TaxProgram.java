import java.util.Scanner;

public class TaxProgram {
    public static void main(String[] args){

        double income, tax, newIncome;

        System.out.println("Please enter your taxable income: ");
        Scanner userInput = new Scanner(System.in);
        income = userInput.nextDouble();
        tax = income * 0.13;
        newIncome = income - tax;

        System.out.println("Income (before tax): " + income);
        System.out.println("Income (after tax): " + newIncome);

    }
}
