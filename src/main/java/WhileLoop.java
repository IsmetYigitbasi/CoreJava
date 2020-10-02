import java.util.Scanner;

public class WhileLoop {
    /*
           Loops are handy because they save time, reduce errors, and they make code more readable.
           The block of while loop runs as long as its condition is true.
           Do not forget to increase the variable used in the condition, otherwise the loop will never end!
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();

        while (num<10){
            System.out.println(num + " is smaller than 10");
            num++;
        }
    }
}
