package Main_Converter;

import java.util.Scanner;

import Converter.currencyconverter;
import Converter.distanceconverter;
import Converter.timeconverter;

public class Converter {

    public static void main(String[] args) {
        double CurrentExchange;
        int choice, choice1, choice2, choice3;
	    double inr, km, hr;
	    char ans='y';

        do
        {
            System.out.println("\n Main menu");
	System.out.println(" 1.Currency Converter \n 2.Distance Converter \n 3.Time converter");
	System.out.println("Enter ur choice");
	
	Scanner input = new Scanner(System.in);
	choice = input.nextInt();

    switch(choice)
    {
        case 1:
        do 
        {
            System.out.println("Menu for currency conversion");
	        System.out.println("1. Dollar to Cedis");
	        System.out.println("2. Euro to Cedis");
	        System.out.println("3. Yen to Cedis");
	        System.out.println("4. Cedis to Dollars");
            System.out.println("Cedis to Euros");
            System.out.println("Cedis to Yens");

            System.out.println("Enter your choice");
	        choice1 = input.nextInt();
	        System.out.println("Please enter the current exchange rate:");
	        CurrentExchange = input.nextDouble();
            currencyconverter cc = new currencyconverter(CurrentExchange);
            switch(choice1)
            {
            case 1:
            System.out.println("Enter Dollars: ");
            double dollar= input.nextDouble();
            System.out.println(dollar + "Dollars are converted to: " + cc.DollarToCedis(dollar) + " Cedis");
            break;
            case 2:
            System.out.println("Enter Euros: ");
            double euro = input.nextDouble();
            System.out.println(euro + "Euros are converted to: " + cc.EuroToCedis(euro) + " Cedis");
            break;
            case 3:
            System.out.println("Enter Yen");
            double yen= input.nextDouble();
            System.out.println(yen + "Yens are converted to: " + cc.YenToCedis(yen) + " Cedis");
            break;
            case 4:
            System.out.println("Enter Cedis: ");
            double cedis = input.nextDouble();
            System.out.println(cedis + "Cedis are converted to: " + cc.CedisToDollar(cedis) + " Dollars");
            break;
            case 5:
            System.out.println("Enter Cedis: ");
            double cedis1 = input.nextDouble();
            System.out.println(cedis1 + "Cedis are converted to: " + cc.CedisToEuro(cedis1) + " Euros");
            break;
            case 6:
            System.out.println("Enter Cedis: ");
            double cedis2 = input.nextDouble();
            System.out.println(cedis2 + "Cedis are converted to Yens: " + cc.CedisToYen(cedis2) + " Yens");
            break;
            }
            System.out.println("Do you want to go to Currency conversion menu? (y/n)");
	        ans = input.next().charAt(0);
        }while(ans=='y');
        break;
        case 2:System.out.println("--distance conversion--");
        do
        {
            System.out.println("Menu for distance conversion");
	System.out.println("1. Meter to KM");
	System.out.println("2. KM to Meter");
	System.out.println("3. Miles to KM");
	System.out.println("4. KM to Miles");
	
	System.out.println("Enter your choice");
	choice2 = input.nextInt();
	
	distanceconverter dc = new distanceconverter();
	switch(choice2)
    {
        case 1:
		System.out.print("Enter meters to convert to km:");
		double meter = input.nextDouble();
		System.out.println(meter+" meters are converted to "+dc.MeterToKM(meter)+"Km.");
	break;
	case 2:
		System.out.print("Enter Km to convert to meters:");
		km= input.nextDouble();
		System.out.println(km+" Km. are converted to"+dc.KMToMeter(km)+"Meters");
	break;
	case 3:
		System.out.print("Enter Miles to convert to Km:");
		double miles= input.nextDouble();
		System.out.println(miles+" Miles are converted to "+dc.MileToKM(miles)+"Km.");
	break;
	case 4:
		System.out.print("Enter Km to convert to miles:");
		km= input.nextDouble();
		System.out.println(km+" Km. are converted to miles "+dc.KMToMile(km)+"Miles");
	break;
    }
    System.out.println("Do you want to go to Distance conversion menu? (y/n)");
	ans = input.next().charAt(0);
        }while(ans=='y');
        break;

        case 3: System.out.println("--time conversion--");
        do
        {
            System.out.println("Menu for time conversion");
            System.out.println("1. Hour to Minutes");
            System.out.println("2. Minutes to Hour");
            System.out.println("3. Hour to Seconds");
            System.out.println("4. Seconds to Hour");
            
            System.out.println("Enter your choice");
            choice3 = input.nextInt();
            timeconverter tc = new timeconverter();
            switch(choice3)
            {
                case 1:
                System.out.print("Enter Hours to convert to Minutes:");
                hr= input.nextDouble();
                System.out.println(hr+" Hours are converted to "+tc.HrToMin(hr)+"min.");
            break;
            case 2:
                System.out.print("Enter minutes to convert to hours:");
                double minutes= input.nextDouble();
                System.out.println(minutes+"Minutes are converted to"+tc.MinToHour(minutes)+"Hours");
            break;
            case 3:
                System.out.print("Enter hours to convert to seconds:");
                hr= input.nextDouble();
                System.out.println(hr+" Hours are converted to "+tc.HrToSec(hr)+"Seconds.");
            break;
            case 4:
                System.out.print("Enter seconds to convert to hours:");
                double seconds= input.nextDouble();
                System.out.println(seconds+" seconds are converted to  "+tc.SecToHour(seconds)+"Hours");
            break;
            }
            System.out.println("Do you want to go to time conversion menu? (y/n)");
            ans = input.next().charAt(0);
        }while(ans=='y');
        break;
    }
    System.out.println("Do you want to go back to main menu? (y/n)");
    ans = input.next().charAt(0);
        }while(ans=='y');
    }

    
}
