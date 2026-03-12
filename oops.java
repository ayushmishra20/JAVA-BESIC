import java.time.LocalDate;


public class oops {
    public static void main(String[] args){
        // users user = new users("Ayush Jr", "2006-05-20" );
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // user.name = "Ayush Jr";
        // user.birthday = LocalDate.parse("20-05-2006",formatter);

        // System.out.printf("%s is born on %s date and he is %d Years old.", user.getName(), user.getbirthday().toString(), user.age());
        
        
        // book.title = "carmila";
        // book.author = "camron";
        // user.borrow(camron);
        
        // System.out.printf("%s borrowed this book : %s ", user.getName()
        //  user.borrowedBooks());
        
        Book camron = new Book(90, "camron", "carmila");
        AudioBook Dracula = new AudioBook(30000, "Dracula", "Bran");
        Ebooks jeevs = new Ebooks(0, "Carry on jeeves", "Jeeves", "pdf", 80);

        System.out.println(jeevs.toString());


    }
}