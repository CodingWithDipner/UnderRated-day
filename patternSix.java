public class patternSix {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        for(i=0;i<=n;i++){
            for(j=0;j<=n;j++)
            {
                if (i==1 || i==5 || j==1 || j==5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.err.println();
        }
    }
}
