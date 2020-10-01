import java.util.Scanner;

public class IfStatement {

     /*
        If Statement is used to specify a block of code to be executed if condition is true
        The condition is typed inside open-close parentheses after if keyword.
        Else Statement is used to specify a block of code to be executed if condition is false.

     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Please enter a number: ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " is bigger than " + num2);
        }else if (num1 < num2){
            System.out.println(num2 + " is bigger than " + num1);
        }else {
            System.out.println(num1 + " is equals to " + num2);
        }

    }
}
