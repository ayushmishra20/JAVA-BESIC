import java.util.Scanner;

public class conditional_statement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter your second number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("What operation you want to perform? ");
        String operation = scanner.nextLine();
        if (operation.equals("sum")){
            System.err.printf("%f + %f = %f", number1 , number2, number1 + number2);
        }else if (operation.equals("sub")){
            System.err.printf("%f - %f = %f", number1 , number2, number1 - number2);
        }else if (operation.equals("mul")){
            System.err.printf("%f * %f = %f", number1 , number2, number1 * number2);
        }else if (operation.equals("div")){
            if(number2 == 0){
                System.out.println("You Better Know the answer is Infinity...:)");
            }else{
                System.err.printf("%f / %f = %f", number1 , number2, number1 / number2);
            }
        }else{
            System.out.println("Invalid operation...");
        }





    }
}
