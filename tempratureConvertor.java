//  How to convert Fahrenheit to Celsius Program

import java.util.Scanner;

public class tempratureConvertor {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Select the conversion");

        
        System.out.println("For Celsius_into_Fahrenheit select press 1 :");
        System.out.println("for Fahrenheit_into_Celsius select press 2 :");

        int n=sc.nextInt();

        if (n==1) {

            System.out.println("Enter the Temprature that need to be converted into Fahrenheit : ");
            int Temprature= sc.nextInt();

            int X=32;
        
            int Fahrenheit=(((Temprature )* 9/5)+X);
            System.out.println(Fahrenheit);
        
    } else {

            System.out.println("Enter the Temprature that need to be converted into Celcius : ");
            int Temprature= sc.nextInt();

            int X=32;
        
            int Celcius=((Temprature-32)*5/9);
            System.out.println(Celcius);
        }

        


    }
}
