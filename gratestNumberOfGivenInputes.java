// Take three numbers from the user and print the greatest number.

public class gratestNumberOfGivenInputes {
    public static void main(String[] args) {
        int i=100;
        int b=200;
        int c=134;

        if (i>b && i>c) {
            System.out.println("The gratest number is : "+i);
        } else if(i<b && b>c){
             System.out.println("The gratest number is : "+b);
        }
        else{
             System.out.println("The gratest number is : "+c);
        }
    }
}
