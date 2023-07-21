import java.util.*;
public class patternFour {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i,j,k;
        System.out.println("Enter the Value of N: ");
        int n=sc.nextInt();
        for(i=0;i<n;i++){
            for(j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
