public class First {
    // this is global variable
    int age ;
    public static void main(String[] args){
        int age = 19;
        String name = "Ayush Mishra";
        System.out.println(name +" is "+ age+ " this year old.");
        
        // Artihmatic Operator
        int number1 = 10;
        int number2 = 5;
        // Addition
        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 * number2);
        System.out.println(number1/number2); 

        // Assignment Operator
        number1 +=5;
        
        System.out.println(number1);
        number1 -= 5;
        System.out.println(number1);
        number2 *=2;
        System.out.println(number2);


    }
}