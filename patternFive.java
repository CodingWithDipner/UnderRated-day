import java.util.Scanner;

public class patternFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,j;
        System.out.println("Enter the Value of N: ");
        int n=sc.nextInt();

        for(i=0;i<=n;i++)
        {
            for(j=0;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
