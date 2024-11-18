
import java.text.NumberFormat;
import java.util.Scanner;
//import java.lang.Math;
import java.text.DecimalFormat;
public class MortgageGenevieve
{

    public static void main ( String [] args )
    {
        int MONTHSINYEAR = 12;
        // ask user to input their mortgage (double)
        Scanner mortgage = new Scanner ( System.in);
        System.out.println(" Please enter your mortgage > ");
        double mortgageInput = mortgage.nextDouble();
        // ask user to input the numbers of years (int)
        Scanner years = new Scanner ( System.in);
        System.out.println(" Please enter the number of years > ");
        int yearsInput = years.nextInt();
        // ask the user to input their interest rate(double)
        Scanner rate = new Scanner ( System.in);
        System.out.println(" Please enter your interest rate > ");

        double rateInput = rate.nextDouble();
        // Calculate the monthly mortgage payment for the interest rate input by the user add 1
        double temp = 1/(1 + rateInput );
        System.out.println(temp);

        // Calculate the monthly mortgage payment for the interest rate input by the user minus it by – 1%
        double tempTwo = (Math.pow(temp,yearsInput*12)-1)/ ( temp - 1 );
        System.out.println(tempTwo);
        double monthlyPayment = mortgageInput / ( temp * tempTwo );
        System.out.println("Your monthly payment is" + monthlyPayment);

        NumberFormat money;
        money = NumberFormat.getCurrencyInstance();
        String convert;
        convert = money.format(monthlyPayment);
        System.out.println(convert);

        // months x years = total payments
        int months = MONTHSINYEAR * yearsInput;
        //Calculate the total payments
        double totalPayment = months * monthlyPayment;
        NumberFormat moneyOne;
        moneyOne = NumberFormat.getCurrencyInstance();
        String convertOne;
        convertOne = money.format(totalPayment);
        System.out.println("The total payment is:" + convertOne);

        //Calculate the total interest payments as a percentage of the original mortgage amount
        double interest = totalPayment - mortgageInput ;
        double interestPercent = interest / mortgageInput ;
        NumberFormat percentage;
        percentage = NumberFormat.getPercentInstance();
        String convertTwo ;
        convertTwo = percentage.format(interestPercent);
        System.out.println("The interest is:" + convertTwo);




     }
}
