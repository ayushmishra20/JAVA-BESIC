public class strings {
    public static void main(String[] args){
        String litralString1 = "Abc";
        String litralString2 = "Abc";

        String objecString1 =  new String("efg");
        String objecString2 = new String("efg");
        
        System.out.println(litralString1 == litralString2);
        System.out.println(objecString1 == objecString2);

        char Percentsign = '%';
        String name = "Ayush Mishra";
        System.out.println(name);
        System.out.println(Percentsign);

        String name = "Ayush Mishra"; //%s
        String company = "Avinya"; //%s
        int age = 19;// %d
        double sgpa= 7.3; // %f
        char ch = '@'; // %c 
        boolean amITELLINGtheTRUTH = true; //%b
        
        String formatedString = String.format("The employee name is %s , The company is %s , Its age is %d and the sgpa is %f ,and the character of this candidate is %c and statement is %b",name , company, age, sgpa , ch, amITELLINGtheTRUTH );
        System.out.println(formatedString);

        System.out.println("The Name of the employee is " + name +" and the AGE is " + age + " Cmpany Name is "+ company+ ".");

         System.out.println(name.length());
         System.out.println(name.toLowerCase());
         System.out.println(name.toUpperCase());
         System.out.println(name.isEmpty());
        System.out.println(name.replace("Ayush","Harsh"));
        //  There are Many Strings Methods in Strings.

    }
}
