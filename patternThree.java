// to print the inverted pattern of pyramind
/*
 *    *****
 *    ****
 *    ***
 *    **
 *    *
 */

public class patternThree {
    public static void main(String[] args) {
        int i,j;
        int n=5;
      for(i=0;i<=n;i++){
        for(j=n;j>=i;j--){
            System.out.print("*");
        }
        System.out.println(" ");
      }
    }
}
