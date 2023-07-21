// Simple Intrest 

// S.I=(P*T*R)/100

import java.util.Scanner;

public class simpleIntrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);

        System.out.println(" Enter the Principle P : ");
        int P=sc.nextInt(); 

        System.out.println(" Enter the Time T : ");
        int T=sc.nextInt(); 

        System.out.println(" Enter the Rate of Intrest R : ");
        int R=sc.nextInt(); 

        
        int SI=(P*T*R)/100;
        System.err.println(" The Intrest for the Princile Ammount "+P+" is : "+SI);
       

    }
}
