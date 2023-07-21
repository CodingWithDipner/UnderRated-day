public class numberPattern {
    public static void main(String[] args) {
        int A=1;

        for(int i=0;i<=5;i++) // for rows
        {
            for(int j=0;j<=i;j++) // for columns 
            {
                System.out.print(A+" ");
                A++; // it prints numbers in line 

                /*
                 1
                 2 3
                 4 5 6
                 7 8 9 10 
                 */
            }
            System.out.println();
            // A++;  // if it is given here, the loop will print the number in row wise like this.
                /*
                1
                2 2
                3 3 3
                4 4 4 4 4
                5 5 5 5 5 5
                */
        }
    }
}
