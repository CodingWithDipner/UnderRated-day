// need to improve it the code

public class numberPattern2 {
    public static void main(String[] args) {
        int Number=1;

        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(Number);
            }
            for(int k=0;k<=i;k++)
            {
                System.err.print(" ");
            }
            Number++;
            System.out.println();
        }
    }
}
