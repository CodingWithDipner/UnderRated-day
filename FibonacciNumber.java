// Write a program to print Fibonacci series.

// 0,1,1,2,3,5,8,12,20,.........

public class FibonacciNumber {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        int counter=0;
        int n=10;


        while(counter<n){
            System.out.println(num1 + " ");
            int num3=num1+num2;
            num1=num2;
            num2=num3;
            counter=counter+1;

        }
        
    }
}
