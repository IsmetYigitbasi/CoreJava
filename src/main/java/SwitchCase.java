import java.util.Scanner;

public class SwitchCase {

     /*
        This is a example of switch case statement.

     */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a programming language: ");
        String programmingLang = sc.nextLine();

        switch (programmingLang){
            case "java":
                System.out.println("It is very popular");
                break;
            case "javascript":
                System.out.println("It is used especially by Front-End Developer");
            case "python":
                System.out.println("It is easy to learn and so popular");
                break;
            default:
                System.out.println("It is not recognized as a programming language");


        }

    }
}
