import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is Your name?");
        String name = scanner.nextLine();
        System.out.printf("Hello %s. How old are you?", name);
        // int age = scanner.nextInt();
        int agE = Integer.parseInt(scanner.nextLine());
        System.out.println("Which language do you prefer?");
        // scanner.nextLine();
        // System.out.printf("%d is a good age to start the programmin and ", age);
        String lang = scanner.nextLine();
        System.out.printf("%d is good age to learning %s language.", agE , lang);


        scanner.close();


    }
    
}
